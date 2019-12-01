/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.model;

/**
 *
 * @author ulisses
 */
public class Lista {

    private String PK_List;
    private String nome;
    private String FK_user;

    public String getPK_List() {
        return PK_List;
    }

    public void setPK_List(String PK_List) {
        this.PK_List = PK_List;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFK_user() {
        return FK_user;
    }

    public void setFK_user(String FK_user) {
        this.FK_user = FK_user;
    }
}
