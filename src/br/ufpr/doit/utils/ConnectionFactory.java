package br.ufpr.doit.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.PreparedStatement;

/**
 *
 * @author ulisses
 */
//Início da classe de conexão//
public class ConnectionFactory {

    public static String status = "Nao conectado";

//Método Construtor da Classe//
    public ConnectionFactory() {

    }

//Método de Conexão//
    public static java.sql.Connection getConexaoMySQL() {

        Connection connection = null;          //atributo do tipo Connection

        try {

// Carregando o JDBC Driver padrão
            String driverName = "org.mariadb.jdbc.Driver";

            Class.forName(driverName);

// Configurando a nossa conexão com um banco de dados//
            String serverName = "localhost:3307";    //caminho do servidor do BD

            String mydatabase = "doit";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            String username = "root";        //nome de um usuário de seu BD      

            String password = "";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//  
            if (connection != null) {

                System.out.println("Conectado");
                status = ("STATUS--->Conectado com sucesso!");

            } else {

                System.out.println("Nao conectado");
                status = ("STATUS--->Não foi possivel realizar conexão");

            }

            return (java.sql.Connection) connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado

            System.out.println("O driver expecificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {

//Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }
    }

    public static PreparedStatement prepareStmt(Connection con, String sql) throws SQLException {
        PreparedStatement pstmt = null;
        pstmt = con.prepareStatement(sql);
        return pstmt;
    }
    
    public static void closePstmt(PreparedStatement pstmt) throws SQLException {
        if (pstmt != null) {
            pstmt.close();
        }
    }

    //Método que retorna o status da sua conexão//
    public static String statusConection() {

        return status;

    }

    //Método que fecha sua conexão//
    public static boolean FecharConexao() {

        try {

            ConnectionFactory.getConexaoMySQL().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

    //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {

        FecharConexao();

        return ConnectionFactory.getConexaoMySQL();

    }

}
