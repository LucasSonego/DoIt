/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.ufpr.doit.controls.ListRN;
import br.ufpr.doit.controls.TaskRN;
import br.ufpr.doit.controls.UserRN;
import br.ufpr.doit.model.Lista;
import br.ufpr.doit.model.Task;
import br.ufpr.doit.model.User;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Just Do It!");
        
        User user = new User();
        UserRN userRN = new UserRN();
        Lista list = new Lista();
        ListRN listRN = new ListRN();
        Task task = new Task();
        TaskRN taskRN = new TaskRN();
        
        List<Task> tasks = new ArrayList<>();
        
        list.setNome("Tesadsadas");
        list.setPK_List("3");
        
        listRN.inserir(list, user);
//        List<String> x = new ArrayList();
//        userRN.listaListasDoUsuario(x, "1");
//        System.out.println(x.get(0));
//        System.out.println(x.get(1));
//
//        task.setNome("final");
////        task.setDescricao("aeifvbuadgfuoadnk;adlgno");
////        task.setConcluida("0");
////        task.setFK_list("59");
//
//        System.out.println(taskRN.listarTasksBD(tasks, x));
//        
//        System.out.println(tasks.get(0).getNome());
//        System.out.println(tasks.get(1).getNome());
//        System.out.println(tasks.get(2).getNome());
//        System.out.println(tasks.size());


    }
}
