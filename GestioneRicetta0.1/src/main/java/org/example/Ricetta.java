package org.example;

import java.util.Map;

public class Ricetta {
    private String nome ;
    private String desc ;
    private Map<ingrediente, Double> ingredientes ;


    public Ricetta(String nome, String desc, Map<ingrediente, Double> ingredientes) {
        this.setNome(nome);
        this.setDesc(desc);
        this.setIngredientes(ingredientes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {

        return "Ricetta{" +
                "nome='" + nome + '\'' +
                ", desc='" + desc ;
    }

    public Map<ingrediente,Double> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Map<ingrediente,Double> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double costoTotale (Map<ingrediente,Double> ingredientes) {
        double costoT = 0 ;

        return costoT ;

    }






}
