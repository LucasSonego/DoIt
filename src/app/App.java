/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.ufpr.doit.conexao.Task;
import br.ufpr.doit.conexao.Task_RN;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Just Do It!");
        Task task = new Task();
        Task_RN taskRn = new Task_RN();

        task.setPK_task("5");


        System.out.println(taskRn.buscarPkTask(task));
        
        System.out.println(task.getDescricao());
        System.out.println(task.getData_inicio());
    }
}
