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
public class User {

    private String PK_user;
    private String nome;
    private String username;
    private String email;
    private String password;
    private String idade;
    private String crete_time;

    public String getPK_user() {
        return PK_user;
    }

    public void setPK_user(String PK_user) {
        this.PK_user = PK_user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCrete_time() {
        return crete_time;
    }

    public void setCrete_time(String crete_time) {
        this.crete_time = crete_time;
    }
}
