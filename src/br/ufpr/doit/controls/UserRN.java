/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.controls;

import br.ufpr.doit.model.Task;
import br.ufpr.doit.model.User;
import br.ufpr.doit.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ulisses
 */
public class UserRN {
    
    public List<Task> tasksConcluidas = new ArrayList<>();
    public List<Task> tasksAtrasadas = new ArrayList<>();
    List<String> listasDesseUsuario = new ArrayList<>();
    
    public boolean inserir(User user) throws Exception {
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "INSERT INTO `user`(`PK_user`, `nome`, `username`, `email`,"
                + " `password`, `idade`, `create_time`)"
                + " VALUES (NULL,?,?,?,?,?,current_timestamp())";
        
        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            stm.setString(1, user.getNome());
            stm.setString(2, user.getUsername());
            stm.setString(3, user.getEmail());
            stm.setString(4, user.getPassword());
            stm.setString(5, user.getIdade());
            
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
    
    public boolean deletar(User user) throws Exception {
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "DELETE FROM `user` WHERE `PK_user` = " + "'" + user.getPK_user() + "'";
        
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
    
    public boolean alterar(User user) throws Exception {
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "UPDATE `user` SET `PK_user`= ?,`nome`= ?,`username`=?,"
                + "`email`= ? ,`password`= ?,`idade`= ?,`create_time`= ?"
                + " WHERE `PK_user` = ?";
        
        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            stm.setString(1, user.getPK_user());
            stm.setString(2, user.getNome());
            stm.setString(3, user.getUsername());
            stm.setString(4, user.getEmail());
            stm.setString(5, user.getPassword());
            stm.setString(6, user.getIdade());
            stm.setString(7, user.getCrete_time());
            stm.setString(8, user.getPK_user());
            
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
    
    public boolean buscarUsername(User user) throws Exception {
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "SELECT `PK_user`, `nome`, `username`, `email`, `password`,"
                + " `idade`, `create_time` FROM `user` WHERE `username`= ?";
        
        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            stm.setString(1, user.getUsername());
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                user.setPK_user(rs.getString("PK_user"));
                user.setNome(rs.getString("nome"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setIdade(rs.getString("idade"));
                user.setCrete_time(rs.getString("create_time"));
                
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
    
    public boolean buscarPkUser(User user) throws Exception {
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "SELECT `PK_user`, `nome`, `username`, `email`, `password`,"
                + " `idade`, `create_time` FROM `user` WHERE `PK_user`= ?";
        
        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            stm.setString(1, user.getPK_user());
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                user.setPK_user(rs.getString("PK_user"));
                user.setNome(rs.getString("nome"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setIdade(rs.getString("idade"));
                user.setCrete_time(rs.getString("create_time"));
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
    
    public boolean login(User user) throws Exception {
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "SELECT `PK_user`, `nome`, `username`, `email`, `password`,"
                + " `idade`, `create_time` FROM `user` WHERE `username`= ?";
        
        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            stm.setString(1, user.getUsername());
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                if (user.getPassword().equals(rs.getString("password"))) {
                    user.setPK_user(rs.getString("PK_user"));
                    user.setNome(rs.getString("nome"));
                    user.setUsername(rs.getString("username"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setIdade(rs.getString("idade"));
                    user.setCrete_time(rs.getString("create_time"));
                    return true;
                }
                
                throw new Exception("senha errada");
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return false;
    }
    
    public boolean listarUserBD(List<User> users) throws Exception {
        
        User user = new User();
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "SELECT `PK_user`, `nome`, `username`, `email`, `password`,"
                + " `idade`, `create_time` FROM `user`";
        
        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                user = new User();
                user.setPK_user(rs.getString("PK_user"));
                user.setNome(rs.getString("nome"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setIdade(rs.getString("idade"));
                user.setCrete_time(rs.getString("create_time"));
                users.add(user);
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
    
    public void listarTasksAtrasadas() throws Exception {
        Connection con = null;
        PreparedStatement stm = null;
        
        Task task = new Task();
        
        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list` FROM `task`";
        
        try {
            listasDesseUsuario.clear();
            listaListasDoUsuario();
            
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                if (verificaTaskUsuario(rs.getString("FK_list")) && atrasado(rs.getString("data_fim"))) {
                    task = new Task();
                    task.setPK_task(rs.getString("PK_task"));
                    task.setNome(rs.getString("nome"));
                    task.setDescricao(rs.getString("descricao"));
                    task.setConcluida(rs.getString("concluida"));
                    task.setData_inicio(rs.getString("data_inicio"));
                    task.setData_fim(rs.getString("data_fim"));
                    task.setTempo_execucao(rs.getString("tempo_execucao"));
                    task.setFK_list(rs.getString("FK_list"));
                    tasksAtrasadas.add(task);
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
    }
    
    public void listarTasksConcluidas() throws Exception {
        Connection con = null;
        PreparedStatement stm = null;
        
        Task task = new Task();
        
        String sql = "SELECT `PK_task`, `nome`, `descricao`, `concluida`, `data_inicio`,"
                + " `data_fim`, `tempo_execucao`, `FK_list` FROM `task`";
        
        try {
            listasDesseUsuario.clear();
            listaListasDoUsuario();
            
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                if (verificaTaskUsuario(rs.getString("FK_list")) && concluida(rs.getString("concluida"))) {
                    task = new Task();
                    task.setPK_task(rs.getString("PK_task"));
                    task.setNome(rs.getString("nome"));
                    task.setDescricao(rs.getString("descricao"));
                    task.setConcluida(rs.getString("concluida"));
                    task.setData_inicio(rs.getString("data_inicio"));
                    task.setData_fim(rs.getString("data_fim"));
                    task.setTempo_execucao(rs.getString("tempo_execucao"));
                    task.setFK_list(rs.getString("FK_list"));
                    tasksConcluidas.add(task);
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
    }
    
    public void listaListasDoUsuario() throws Exception {
        
        String pkList;
        
        Connection con = null;
        PreparedStatement stm = null;
        
        String sql = "SELECT `PK_List`, `nome`, `FK_user` FROM `List`";
        
        try {
            
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                pkList = rs.getString("PK_List");
                listasDesseUsuario.add(pkList);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
    }
    
    private boolean verificaTaskUsuario(String x) {
        try {
            for (int i = 0; i < listasDesseUsuario.size(); i++) {
                if (listasDesseUsuario.get(i).equals(x)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
    
    private boolean atrasado(String x) {
        try {
            if (x == null) {
                return false;
            } else {
                SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = dtf.parse(x);
                
                Date datehj = new Date();
                int result = datehj.compareTo(date);
                if (result >= 0) {
                    return true;
                }
                return false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    private boolean concluida(String x) {
        try {
            if (x.equals("1")) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
