package interfaci;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca implements Autenticavel{

    public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmisao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmisao);
    }

  
    @Override
    public String toString() {
        return super.toString() + 
               "Gerente{" + '}';
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
    
    
}