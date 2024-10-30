package com.xmacedo.grafos;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo1 {
    public static void main(String[] args) {
        Deque<String> doubleQueue = new LinkedList<>();


        
        Queue<String> fila = new LinkedList<>();

        fila.add("Alice");
        fila.add("Bob");
        fila.add("Claire");

        String pessoaRemovida = fila.remove();

        if(verificaSeEhVendedorManga(pessoaRemovida)){
            System.out.println(pessoaRemovida+ " é");
        }
        System.out.println(pessoaRemovida);

    }

    private static boolean verificaSeEhVendedorManga(String pessoaRemovida) {


        return false;
    }

}
