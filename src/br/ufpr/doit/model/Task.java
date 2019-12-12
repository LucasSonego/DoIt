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
public class Task {

    private String PK_task;
    private String nome;
    private String descricao;
    private String concluida;
    private String data_inicio;
    private String data_fim;
    private String tempo_execucao;
    private String FK_list;
    private String importante;

    public String getPK_task() {
        return PK_task;
    }

    public void setPK_task(String PK_task) {
        this.PK_task = PK_task;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConcluida() {
        return concluida;
    }

    public void setConcluida(String concluida) {
        this.concluida = concluida;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getTempo_execucao() {
        return tempo_execucao;
    }

    public void setTempo_execucao(String tempo_execucao) {
        this.tempo_execucao = tempo_execucao;
    }

    public String getFK_list() {
        return FK_list;
    }

    public void setFK_list(String FK_list) {
        this.FK_list = FK_list;
    }

    public String getImportante() {
        return importante;
    }

    public void setImportante(String importante) {
        this.importante = importante;
    }

}
