package ativcomputador;

public class PlacaMae {
    private String marca;
    private String modelo;
    private double soquete;

    public PlacaMae(String marca, String modelo, double soquete) {
        this.marca = marca;
        this.modelo = modelo;
        this.soquete = soquete;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getSoquete() {
        return soquete;
    }

    public void setSoquete(double soquete) {
        this.soquete = soquete;
    }
    
    
}
