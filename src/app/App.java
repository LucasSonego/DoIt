/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.ufpr.doit.controls.UserRN;
import br.ufpr.doit.model.Task;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Just Do It!");

        UserRN userRN = new UserRN();

        userRN.listarTasksConcluidas();

        Task task = userRN.tasksConcluidas.get(0);

        System.out.println(task.getNome());

        task = userRN.tasksConcluidas.get(1);

        System.out.println(task.getNome());

        int x = userRN.tasksConcluidas.size();

        System.out.println(x);

        task = userRN.tasksConcluidas.get(2);

        System.out.println(task.getNome());

        task = userRN.tasksConcluidas.get(3);

        System.out.println(task.getNome());

    }
}
