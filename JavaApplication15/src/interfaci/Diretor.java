package interfaci;
  
import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Autenticavel{
      
private final double PREMIO = 0.1;

    public Diretor(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmisao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmisao);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Prêmio: " + PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return SalarioFinal;
    }

   
    
}