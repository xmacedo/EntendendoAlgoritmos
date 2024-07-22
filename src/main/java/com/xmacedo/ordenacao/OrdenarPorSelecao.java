package com.xmacedo.ordenacao;

import java.util.ArrayList;
import java.util.List;

//Capitulo 2
public class OrdenarPorSelecao {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(5, 3, 6, 2, 10));
        System.out.println(ordenarPorSelecao(arr));
    }

    private static List<Integer> ordenarPorSelecao(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>();
        while (!arr.isEmpty()) {
            int menor = buscaMenorIndice(arr);
            novoArr.add(arr.remove(menor));
        }
        return novoArr;
    }

    private static int buscaMenorIndice(List<Integer> arr) {
        int menor = arr.get(0);
        int menorIndice = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }
}
