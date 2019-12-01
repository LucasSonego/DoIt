/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.controls;

import br.ufpr.doit.utils.ConnectionFactory;
import br.ufpr.doit.model.Task;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author ulisses
 */
public class TaskRN {

    public boolean inserir(Task task) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "INSERT INTO `task` (`PK_task`, `nome`, `descricao`,"
                + " `concluida`, `data_inicio`, `data_fim`, `tempo_execucao`,"
                + " `FK_list`) VALUES (NULL,?,?,?,?,?,?,?)";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, task.getNome());
            stm.setString(2, task.getDescricao());
            stm.setString(3, task.getConcluida());
            stm.setString(4, task.getData_inicio());
            stm.setString(5, task.getData_fim());
            stm.setString(6, task.getTempo_execucao());
            stm.setString(7, task.getFK_list());

            stm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return true;
    }

    public boolean deletar(Task task) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "DELETE FROM `task` WHERE `PK_task` = " + "'" + task.getPK_task() + "'";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return true;
    }

    public boolean alterar(Task task) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "UPDATE `task` SET `PK_task`= ?,`nome`= ?,"
                + "`descricao`= ?,`concluida`= ?,`data_inicio`= ?,"
                + "`data_fim`= ?,`tempo_execucao`= ?,`FK_list`= ?"
                + " WHERE `PK_task` = ?";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

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

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return true;
    }

    public boolean buscarNome(Task task) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list` FROM `task`"
                + " WHERE `nome` = ?";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, task.getNome());

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                task.setPK_task(rs.getString("PK_task"));
                task.setNome(rs.getString("nome"));
                task.setDescricao(rs.getString("descricao"));
                task.setConcluida(rs.getString("concluida"));
                task.setData_inicio(rs.getString("data_inicio"));
                task.setData_fim(rs.getString("data_fim"));
                task.setTempo_execucao(rs.getString("tempo_execucao"));
                task.setFK_list(rs.getString("FK_list"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return true;
    }

    public boolean buscarPkTask(Task task) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list` FROM `task`"
                + " WHERE `PK_task` = ?";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, task.getPK_task());

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                task.setPK_task(rs.getString("PK_task"));
                task.setNome(rs.getString("nome"));
                task.setDescricao(rs.getString("descricao"));
                task.setConcluida(rs.getString("concluida"));
                task.setData_inicio(rs.getString("data_inicio"));
                task.setData_fim(rs.getString("data_fim"));
                task.setTempo_execucao(rs.getString("tempo_execucao"));
                task.setFK_list(rs.getString("FK_list"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return true;
    }

    public boolean listarTasksBD(List<Task> tasks) throws Exception {

        Task task = new Task();

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list` FROM `task`";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                task = new Task();
                task.setPK_task(rs.getString("PK_task"));
                task.setNome(rs.getString("nome"));
                task.setDescricao(rs.getString("descricao"));
                task.setConcluida(rs.getString("concluida"));
                task.setData_inicio(rs.getString("data_inicio"));
                task.setData_fim(rs.getString("data_fim"));
                task.setTempo_execucao(rs.getString("tempo_execucao"));
                task.setFK_list(rs.getString("FK_list"));
                tasks.add(task);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return true;
    }
}
