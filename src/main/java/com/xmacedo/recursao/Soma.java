package com.xmacedo.recursao;

import java.util.ArrayList;
import java.util.List;

public class Soma {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(5, 3, 6, 2, 10));
        System.out.println("Soma da lista é: "+ soma(lst, 0));
    }

    private static int soma(List<Integer> lst, int pos) {
        if(pos == lst.size()){
            return 0;
        }
        return lst.get(pos) + soma(lst, pos +1);
    }
}
