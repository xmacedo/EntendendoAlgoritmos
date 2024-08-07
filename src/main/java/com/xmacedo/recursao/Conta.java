package com.xmacedo.recursao;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(5, 3, 6, 2, 10));
        System.out.println("A quantidade de itens é: "+ conta(lst, 0));
    }

    private static int conta(List<Integer> lst, int pos) {
        if(pos == lst.size()){
            return 0;
        }
        return 1 + conta(lst, pos +1);
    }
}
