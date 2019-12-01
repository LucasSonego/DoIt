/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.controls;

import br.ufpr.doit.model.Lista;
import br.ufpr.doit.utils.ConnectionFactory;
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
    
    public boolean inserir(Lista list) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "INSERT INTO `List` (`PK_List`, `nome`, `FK_user`)"
                + " VALUES (NULL,?,?);";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, list.getNome());
            stm.setString(2, list.getFK_user());


            stm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
            return true;
        }
    }

    public boolean deletar(Lista list) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "DELETE FROM `List` WHERE `PK_list` = " + "'" + list.getPK_List()+ "'";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
            return true;
        }
    }

    public boolean alterar(Lista list) throws Exception {

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "UPDATE `List` SET `PK_List`=?,`nome`=?,`FK_user`=?"
                + " WHERE `PK_List` = ?";

        try {
            con = ConnectionFactory.getConexaoMySQL();
            stm = ConnectionFactory.prepareStmt(con, sql);

            stm.setString(1, list.getPK_List());
            stm.setString(2, list.getNome());
            stm.setString(3, list.getFK_user());
            stm.setString(4, list.getPK_List());

            stm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
            return true;
        }
    }

    public boolean buscarNome(Lista list) throws Exception {

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
                list.setPK_List(rs.getString("PK_List"));
                list.setNome(rs.getString("nome"));
                list.setFK_user(rs.getString("FK_user"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
            return true;
        }
    }

    public boolean buscarPkList(Lista list) throws Exception {

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
                list.setPK_List(rs.getString("PK_list"));
                list.setNome(rs.getString("nome"));
                list.setFK_user(rs.getString("FK_user"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
            return true;
        }
    }

    public boolean listarListsBD(List<Lista> lists) throws Exception {

        Lista list = new Lista();

        Connection con = null;
        PreparedStatement stm = null;

        String sql = "SELECT `PK_List`, `nome`, `FK_user` FROM `List`";

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
        } finally {
            ConnectionFactory.FecharConexao();
            ConnectionFactory.closePstmt(stm);
            return true;
        }
    }
}
