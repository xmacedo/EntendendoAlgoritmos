package com.xmacedo.hash;

import java.util.HashMap;

//Capitulo 5, pag 104
public class Cache {
    private static HashMap<String, String> cache = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(pegaPagina("index"));
        System.out.println(pegaPagina("about"));
        System.out.println(pegaPagina("index"));
    }

    private static String pegaPagina(String pagina) {
        if (!cache.isEmpty() && cache.get(pagina) != null) {
            return cache.get(pagina);
        } else {
            return pegaPaginaServidor(pagina);
        }
    }

    private static String pegaPaginaServidor(String pagina) {
        cache.put(pagina, "dados cache");
        return "Pagina: Dados Servidor";
    }
}
