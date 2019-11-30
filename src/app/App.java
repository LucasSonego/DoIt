/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import br.ufpr.doit.conexao.Conexao;
import br.ufpr.doit.conexao.Task;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
        
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Just Do It!");
        Task task = new Task();
        Conexao con = new Conexao();
        Statement stm = con.getConexaoMySQL().createStatement();

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
    }
}
