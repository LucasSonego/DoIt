/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.ufpr.doit.controls.ListRN;
import br.ufpr.doit.model.Lista;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Just Do It!");
        Lista list = new Lista();
        ListRN listRN = new ListRN();
        List<Lista> listas = new ArrayList<>();
        
//        list.setPK_List("61");
//        list.setNome("entrete");
//        list.setFK_user("1");
        
        System.out.println(listRN.listarListsBD(listas));
        
        list = listas.get(0);
        System.out.println(list.getPK_List());
        System.out.println(list.getNome());
        System.out.println(list.getFK_user());
        list = listas.get(1);
        System.out.println(list.getPK_List());
        System.out.println(list.getNome());
        System.out.println(list.getFK_user());
        list = listas.get(2);
        System.out.println(list.getPK_List());
        System.out.println(list.getNome());
        System.out.println(list.getFK_user());
    }
}
