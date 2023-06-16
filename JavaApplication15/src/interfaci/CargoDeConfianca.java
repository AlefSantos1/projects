package interfaci;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
   protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmisao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmisao);
    }

 
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
   
   
    
    
}