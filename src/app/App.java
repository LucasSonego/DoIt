/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.ufpr.doit.conexao.Task;
import br.ufpr.doit.conexao.Task_RN;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Just Do It!");
        Task task = new Task();
        Task_RN taskRn = new Task_RN();
        
        List<Task> tasks = new ArrayList<>();

//        task.setNome("projeto final");
//        task.setDescricao("sem criatividade para uma descricao");
//        task.setConcluida("0");
//        task.setFK_list("1");

//        task.setPK_task("6");


        System.out.println(taskRn.listarTasksBD(tasks));
        
        task = tasks.get(0);
        System.out.println(task.getNome());
        System.out.println(task.getDescricao());
        System.out.println(task.getConcluida());
        task = tasks.get(1);
        System.out.println(task.getNome());
        System.out.println(task.getDescricao());
        System.out.println(task.getConcluida());
        task = tasks.get(2);
        System.out.println(task.getNome());
        System.out.println(task.getDescricao());
        System.out.println(task.getConcluida());
    }
}
