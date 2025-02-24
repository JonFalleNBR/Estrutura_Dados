package com.jonathan.estruturasdados.vetor;

public class VetorSimples {
    private String[] elementos;

    public VetorSimples(int capacidade){
        this.elementos = new String[capacidade];

    }

    public void Adiciona(String elemento){
            for(int i = 0; i < this.elementos.length; i++){
                if(this.elementos[i] == null){
                    this.elementos[i] = elemento;
                    break;
                }

            }

    }
}
