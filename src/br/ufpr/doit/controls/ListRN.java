/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.controls;

import br.ufpr.doit.model.Lista;
import br.ufpr.doit.model.User;
import br.ufpr.doit.utils.ConnectionFactory;
import br.ufpr.doit.utils.SomaHorasString;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ulisses
 */
public class ListRN {

    public boolean inserir(Lista list, User user) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "INSERT INTO `List` (`PK_List`, `nome`, `FK_user`)"
                + " VALUES (NULL,?,?);";

        try {
            if (verificaUsuario(user.getPK_user(), list.getFK_user())) {
                con = ConnectionFactory.getConexaoMySQL();
                stm = ConnectionFactory.prepareStmt(con, sql);

                stm.setString(1, list.getNome());
                stm.setString(2, list.getFK_user());

                stm.execute();
            } else {
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

        String sql = "DELETE FROM `List` WHERE `PK_list` = " + "'" + pk + "'";

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

    public boolean alterar(Lista list, User user) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "UPDATE `List` SET `PK_List`=?,`nome`=?,`FK_user`=?"
                + " WHERE `PK_List` = ?";

        try {
            if (verificaUsuario(user.getPK_user(), list.getFK_user())) {
                con = ConnectionFactory.getConexaoMySQL();
                stm = ConnectionFactory.prepareStmt(con, sql);

                stm.setString(1, list.getPK_List());
                stm.setString(2, list.getNome());
                stm.setString(3, list.getFK_user());
                stm.setString(4, list.getPK_List());

                stm.execute();
            } else {
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

    public boolean buscarNome(Lista list, User user) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_List`, `nome`, `FK_user` FROM `List` "
                + "WHERE `nome` = ?";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, list.getNome());

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (verificaUsuario(user.getPK_user(), list.getFK_user())) {
                    list.setPK_List(rs.getString("PK_List"));
                    list.setNome(rs.getString("nome"));
                    list.setFK_user(rs.getString("FK_user"));
                } else {
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

    public boolean buscarPkList(Lista list, User user) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_List`, `nome`, `FK_user` FROM `List` "
                + "WHERE `PK_List` = ?";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, list.getPK_List());

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (verificaUsuario(user.getPK_user(), list.getFK_user())) {
                    list.setPK_List(rs.getString("PK_List"));
                    list.setNome(rs.getString("nome"));
                    list.setFK_user(rs.getString("FK_user"));
                } else {
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

    public boolean listarListsBD(List<Lista> lists, User user) throws Exception {

        Lista list = new Lista();

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_List`, `nome`, `FK_user` FROM `List` WHERE FK_user = " + user.getPK_user() + ";";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                list = new Lista();
                list.setPK_List(rs.getString("PK_list"));
                list.setNome(rs.getString("nome"));
                list.setFK_user(rs.getString("FK_user"));
                lists.add(list);
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

    private boolean verificaUsuario(String user, String list) {
        try {
            if (user.equals(list)) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String totalHorasConclusaoLista(String pkList) throws SQLException {

        String times = null;

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT * FROM `task` WHERE `FK_list` = " + "'" + pkList + "'";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                if (rs.getString("FK_list").equals(pkList)) {

                    SomaHorasString shs = new SomaHorasString();
                    times = shs.somaHorasString(times, rs.getString("tempo_execucao"));
                }
            }
            return times;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
        }
        return null;
    }

}
