/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.utils;

/**
 *
 * @author ulisses
 */
public class SomaHorasString {
    
    public String somaHorasString(String atual, String nova) {
        try {
            if (atual != null) {

                int ponto1 = verificaPontoString(atual, 0);
                int ponto2 = verificaPontoString(atual, ponto1 + 1);

                int horaAtual = Integer.parseInt(atual.substring(0, ponto1));
                int minutoAtual = Integer.parseInt(atual.substring(ponto1 + 1, ponto2));
                int segundoAtual = Integer.parseInt(atual.substring(ponto2 + 1, atual.length()));

                int ponto1nova = verificaPontoString(nova, 0);
                int ponto2nova = verificaPontoString(nova, ponto1 + 1);

                int horaNova = Integer.parseInt(nova.substring(0, ponto1nova));
                int minutoNova = Integer.parseInt(nova.substring(ponto1nova + 1, ponto2nova));
                int segundoNova = Integer.parseInt(nova.substring(ponto2nova + 1, nova.length()));

                int returnHora = horaAtual + horaNova;
                int returnMinuto = minutoAtual + minutoNova;
                int returnSegundo = segundoAtual + segundoNova;

                if (returnSegundo > 60) {
                    returnMinuto = returnMinuto + returnSegundo / 60;
                    returnSegundo = returnSegundo % 60;
                }

                if (returnMinuto > 60) {
                    returnHora = returnHora + returnMinuto / 60;
                    returnMinuto = returnMinuto % 60;
                }

                String stringHora;
                String stringMinuto;
                String stringSegundo;

                if (returnHora < 10) {
                    stringHora = "0" + String.valueOf(returnHora);
                } else {
                    stringHora = String.valueOf(returnHora);
                }

                if (returnMinuto < 10) {
                    stringMinuto = "0" + String.valueOf(returnMinuto);
                } else {
                    stringMinuto = String.valueOf(returnMinuto);
                }

                if (returnSegundo < 10) {
                    stringSegundo = "0" + String.valueOf(returnSegundo);
                } else {
                    stringSegundo = String.valueOf(returnSegundo);
                }

                return (stringHora + ":" + stringMinuto + ":" + stringSegundo);

            } else {
                return atual = nova;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private int verificaPontoString(String x, int a) {
        try {
            for (int i = a; i < x.length(); i++) {
                if (x.charAt(i) == ':') {
                    return i;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
