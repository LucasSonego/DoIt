/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.ufpr.doit.controls.UserRN;
import br.ufpr.doit.model.Task;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Just Do It!");

        UserRN userRN = new UserRN();
        List<Task> xs = new ArrayList<>();

        userRN.excluiTarefaConcluidas();

//        Task task = xs.get(0);
//
//        System.out.println(task.getNome());
//
//        task = xs.get(1);
//
//        System.out.println(task.getNome());
//
//        int x = xs.size();
//
//        System.out.println(x);
//
//        task = xs.get(2);
//
//        System.out.println(task.getNome());
//
//        task = xs.get(3);
//
//        System.out.println(task.getNome());

    }
}
