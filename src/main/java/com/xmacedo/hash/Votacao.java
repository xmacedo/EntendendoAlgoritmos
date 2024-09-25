package com.xmacedo.hash;

import java.util.HashMap;

//Capitulo 5 pag 101
public class Votacao {

    private static HashMap<String, Boolean> listVotaram = new HashMap<>();

    public static void main(String[] args) {
        verificaEleitor("tom");
        verificaEleitor("mike");
        verificaEleitor("mike");
    }

    private static void verificaEleitor(String nome) {
        if (!listVotaram.isEmpty() && listVotaram.get(nome) != null) {
            System.out.println("Mande embora!");
        } else {
            listVotaram.put(nome, true);
            System.out.println("Deixe votar!");
        }
    }
}
