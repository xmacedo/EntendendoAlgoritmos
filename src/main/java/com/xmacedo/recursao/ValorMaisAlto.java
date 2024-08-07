package com.xmacedo.recursao;

import java.util.ArrayList;
import java.util.List;

public class ValorMaisAlto {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(5, 3, 6, 22, 15, 7, 10));
        System.out.println("O valor mais alto da lista é: " + achaValor(lst, 0));
    }

    private static int achaValor(List<Integer> lst, int pos) {
        //caso base se o indice for o ultimo da lista, retorna o atual
        if (pos == lst.size() - 1) {
            return lst.get(pos);
        }
        //Caso recursivo, valor maixmo entre o atual e o próximo (maximo dos elementos resultantes);
        return Math.max(lst.get(pos), achaValor(lst, pos + 1));
    }
}
