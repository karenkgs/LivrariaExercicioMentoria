package br.com.casadocodigo.livraria;

import java.util.*;

public class GerenciadorDeCupons {
    private Map<String, Double> cupons;

    public GerenciadorDeCupons(){
        this.cupons = new HashMap<>();
        cupons.put("CUP74", 10.0);
        cupons.put("CUP158", 10.0);
        cupons.put("CUP14", 10.0);
        cupons.put("CUP52", 10.0);
        cupons.put("CUP21", 10.0);
        cupons.put("CUP221", 10.0);
        cupons.put("CUP91", 10.0);
        cupons.put("CUP327", 10.0);
        cupons.put("CUP410", 10.0);
        cupons.put("CUP275", 10.0);
        cupons.put("CUP484", 10.0);
    }

//    public boolean validaCupom(String cupom){
//        return this.cupons.containsKey(cupom);
//    }
    public Double validaCupom(String cupom){
        return this.cupons.get(cupom);
    }
}
