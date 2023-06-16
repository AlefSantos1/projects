package atvveiculo;

public class Veiculo {
    private String Nomevei;
    private String Placa;
    private String Cor;
    private int Npas;
    private int Capdtan;
    private int Vlm;
    private double Conm;

    public Veiculo(String Nomevei, String Placa, String Cor, int Npas, int Capdtan, int Vlm, double Conm) {
        this.Nomevei = Nomevei;
        this.Placa = Placa;
        this.Cor = Cor;
        this.Npas = Npas;
        this.Capdtan = Capdtan;
        this.Vlm = Vlm;
        this.Conm = Conm;
    }

    
    public String getNomevei() {
        return Nomevei;
    }

    public void setNomevei(String Nomevei) {
        this.Nomevei = Nomevei;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public int getNpas() {
        return Npas;
    }

    public void setNpas(int Npas) {
        this.Npas = Npas;
    }

    public int getCapdtan() {
        return Capdtan;
    }

    public void setCapdtan(int Capdtan) {
        this.Capdtan = Capdtan;
    }

    public int getVlm() {
        return Vlm;
    }

    public void setVlm(int Vlm) {
        this.Vlm = Vlm;
    }

    public double getConm() {
        return Conm;
    }

    public void setConm(double Conm) {
        this.Conm = Conm;
    }
}
    