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

    public boolean inserir(Task task, List<String> fkList) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "INSERT INTO `task` (`PK_task`, `nome`, `descricao`,"
                + " `concluida`, `data_inicio`, `data_fim`, `tempo_execucao`,"
                + " `FK_list`, `importante` ) VALUES (NULL,?,?,?,?,?,?,?,?)";

        try {
            
            if (verificaTaskLista(fkList, task.getFK_list())){
                con = ConnectionFactory.getConexaoMySQL();
                stm = ConnectionFactory.prepareStmt(con, sql);

                stm.setString(1, task.getNome());
                stm.setString(2, task.getDescricao());
                stm.setString(3, task.getConcluida());
                stm.setString(4, task.getData_inicio());
                stm.setString(5, task.getData_fim());
                stm.setString(6, task.getTempo_execucao());
                stm.setString(7, task.getFK_list());
                stm.setString(8, task.getImportante());

                stm.execute();
            }else{
                return false;
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

    public boolean deletar(String pk) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "DELETE FROM `task` WHERE `PK_task` = " + "'" + pk + "'";

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

    public boolean alterar(Task task, List<String> fkList) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "UPDATE `task` SET `PK_task`= ?,`nome`= ?,"
                + "`descricao`= ?,`concluida`= ?,`data_inicio`= ?,"
                + "`data_fim`= ?,`tempo_execucao`= ?,`FK_list`= ? , `importante` = ?"
                + " WHERE `PK_task` = ?";

        try {
            
            if (verificaTaskLista(fkList, task.getFK_list())){
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
                stm.setString(9, task.getImportante());
                stm.setString(10, task.getPK_task());

                stm.execute();
            }else{
                return false;
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

    public boolean buscarNome(Task task, List<String> fkList) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list`, `importante` FROM `task`"
                + " WHERE `nome` = ?";

        try {
            
        
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, task.getNome());

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (verificaTaskLista(fkList, rs.getString("FK_List"))){
                    task.setPK_task(rs.getString("PK_task"));
                    task.setNome(rs.getString("nome"));
                    task.setDescricao(rs.getString("descricao"));
                    task.setConcluida(rs.getString("concluida"));
                    task.setData_inicio(rs.getString("data_inicio"));
                    task.setData_fim(rs.getString("data_fim"));
                    task.setTempo_execucao(rs.getString("tempo_execucao"));
                    task.setFK_list(rs.getString("FK_list"));
                    task.setImportante(rs.getString("importante"));
                }else{
                    return false;
                }
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

    public boolean buscarPkTask(Task task, List<String> fkList) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list`, `importante` FROM `task`"
                + " WHERE `PK_task` = ?";

        try {
            
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, task.getPK_task());

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (verificaTaskLista(fkList, rs.getString("FK_List"))){
                    task.setPK_task(rs.getString("PK_task"));
                    task.setNome(rs.getString("nome"));
                    task.setDescricao(rs.getString("descricao"));
                    task.setConcluida(rs.getString("concluida"));
                    task.setData_inicio(rs.getString("data_inicio"));
                    task.setData_fim(rs.getString("data_fim"));
                    task.setTempo_execucao(rs.getString("tempo_execucao"));
                    task.setFK_list(rs.getString("FK_list"));
                    task.setImportante(rs.getString("importante"));
                }else{
                    return false;
                }

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

    public boolean listarTasksBD(List<Task> tasks, List<String> fkList) throws Exception {

        Task task = new Task();

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list`, `importante` FROM `task`";

        try {

            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (verificaTaskLista(fkList, rs.getString("FK_List"))){
                    task = new Task();
                    task.setPK_task(rs.getString("PK_task"));
                    task.setNome(rs.getString("nome"));
                    task.setDescricao(rs.getString("descricao"));
                    task.setConcluida(rs.getString("concluida"));
                    task.setData_inicio(rs.getString("data_inicio"));
                    task.setData_fim(rs.getString("data_fim"));
                    task.setTempo_execucao(rs.getString("tempo_execucao"));
                    task.setFK_list(rs.getString("FK_list"));
                    task.setImportante(rs.getString("importante"));
                    tasks.add(task);
                }
                
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
    
    private boolean verificaTaskLista(List<String> x, String y){
        try {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i).equals(y)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    } 
}
