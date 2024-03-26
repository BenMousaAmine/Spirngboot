package org.example;

public class ingrediente {
    private String nomeIngrediente ;
    private double costo ;


    public ingrediente(String nomeIngrediente, double costo) {
        this.setNomeIngrediente(nomeIngrediente);
        this.setCosto(costo);
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ingrediente{" +
                "nomeIngrediente='" + nomeIngrediente + '\'' +
                ", costo=" + costo +
                '}';
    }
}
