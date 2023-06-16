package interfaci;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmisao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmisao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Placa da moto:" + placaDaMoto;
    }


}