/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.conexao;

import static br.ufpr.doit.conexao.Conexao.getConexaoMySQL;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ulisses
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Task task = new Task();
        Conexao con = new Conexao();
        Statement stm = getConexaoMySQL().createStatement();

                     ResultSet rs = stm.executeQuery("select * from task where nome = 'Teste'");
                     while (rs.next())
                     {

                        task.setNome(rs.getString("nome"));
                        task.setPK_task(rs.getString("PK_Task"));
                        task.setDescricao(rs.getString("descricao"));
                        task.setConcluida(rs.getString("concluida"));
                        task.setData_inicio(rs.getString("data_inicio"));
                        task.setData_fim(rs.getString("data_fim"));
                        task.setTempo_execucao(rs.getString("tempo_execucao"));
                        task.setFK_list(rs.getString("FK_list"));
                     }
                     
        System.out.println(task.getNome());
        System.out.println(task.getConcluida());
        System.out.println(task.getDescricao());
        System.out.println(con.statusConection());
    }
    
}
