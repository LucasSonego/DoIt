/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author ulisses
 */
public class Task_RN {

    Conexao con;

    public boolean inserir(Task task) throws Exception {

        String sql = "INSERT INTO `task` (`PK_task`, `nome`, `descricao`,"
                + " `concluida`, `data_inicio`, `data_fim`, `tempo_execucao`,"
                + " `FK_list`) VALUES (NULL,?,?,?,?,?,?,?)";

        try {
            con = new Conexao();
            PreparedStatement stm = con.getConexaoMySQL().prepareStatement(sql);

            stm.setString(1, task.getNome());
            stm.setString(2, task.getDescricao());
            stm.setString(3, task.getConcluida());
            stm.setString(4, task.getData_inicio());
            stm.setString(5, task.getData_fim());
            stm.setString(6, task.getTempo_execucao());
            stm.setString(7, task.getFK_list());

            stm.execute();
            stm.close();

            return true;

        } catch (SQLException e) {
            throw new Exception("falha ao inserir em task: \n" + e.getMessage());
        }
    }

    public boolean deletar(Task task) throws Exception {

        String sql = "DELETE FROM `task` WHERE `PK_task` = " + "'" + task.getPK_task() + "'";

        try {
            con = new Conexao();
            PreparedStatement stm = con.getConexaoMySQL().prepareStatement(sql);
            stm.execute();
            stm.close();

            return true;

        } catch (SQLException e) {
            throw new Exception("falha ao deletar em task: \n" + e.getMessage());
        }
    }

    public boolean alterar(Task task) throws Exception {

        String sql = "UPDATE `task` SET `PK_task`= ?,`nome`= ?,"
                + "`descricao`= ?,`concluida`= ?,`data_inicio`= ?,"
                + "`data_fim`= ?,`tempo_execucao`= ?,`FK_list`= ?"
                + " WHERE `PK_task` = ?";

        try {
            con = new Conexao();
            PreparedStatement stm = con.getConexaoMySQL().prepareStatement(sql);

            stm.setString(1, task.getPK_task());
            stm.setString(2, task.getNome());
            stm.setString(3, task.getDescricao());
            stm.setString(4, task.getConcluida());
            stm.setString(5, task.getData_inicio());
            stm.setString(6, task.getData_fim());
            stm.setString(7, task.getTempo_execucao());
            stm.setString(8, task.getFK_list());
            stm.setString(9, task.getPK_task());

            stm.execute();
            stm.close();

            return true;

        } catch (SQLException e) {
            throw new Exception("falha ao alterar em task: \n" + e.getMessage());
        }
    }

    public boolean buscarNome(Task task) throws Exception {

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list` FROM `task`"
                + " WHERE `nome` = ?";

        try {
            con = new Conexao();
            PreparedStatement stm = con.getConexaoMySQL().prepareStatement(sql);

            stm.setString(1, task.getNome());

            ResultSet rs = stm.executeQuery();
            
            while (rs.next()){
                task.setPK_task(rs.getString("PK_task"));
                task.setNome(rs.getString("nome"));
                task.setDescricao(rs.getString("descricao"));
                task.setConcluida(rs.getString("concluida"));
                task.setData_inicio(rs.getString("data_inicio"));
                task.setData_fim(rs.getString("data_fim"));
                task.setTempo_execucao(rs.getString("tempo_execucao"));
                task.setFK_list(rs.getString("FK_list"));
            }
            
            stm.close();

            return true;

        } catch (SQLException e) {
            throw new Exception("falha ao buscar por nome em task: \n" + e.getMessage());
        }
    }
    
    public boolean buscarPkTask(Task task) throws Exception {

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list` FROM `task`"
                + " WHERE `PK_task` = ?";

        try {
            con = new Conexao();
            PreparedStatement stm = con.getConexaoMySQL().prepareStatement(sql);

            stm.setString(1, task.getPK_task());

            ResultSet rs = stm.executeQuery();
            
            while (rs.next()){
                task.setPK_task(rs.getString("PK_task"));
                task.setNome(rs.getString("nome"));
                task.setDescricao(rs.getString("descricao"));
                task.setConcluida(rs.getString("concluida"));
                task.setData_inicio(rs.getString("data_inicio"));
                task.setData_fim(rs.getString("data_fim"));
                task.setTempo_execucao(rs.getString("tempo_execucao"));
                task.setFK_list(rs.getString("FK_list"));
            }
            
            stm.close();

            return true;

        } catch (SQLException e) {
            throw new Exception("falha ao buscar pelo PK da task em task: \n" + e.getMessage());
        }
    }

}
