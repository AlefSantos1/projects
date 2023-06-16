package interfaci;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal{
   protected String nome;
   protected String cpf;
   protected String rg;
   protected Genero genero;
   protected double salarioBase;
   protected LocalDate dataNascimento;
   protected LocalDate dataAdmisao;

    public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmisao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmisao = dataAdmisao;
    }

    public int getIdade(){
    
        return Period.between(dataNascimento, LocalDate.now()).getYears();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmisao() {
        return dataAdmisao;
    }

    public void setDataAdmisao(LocalDate dataAdmisao) {
        this.dataAdmisao = dataAdmisao;
    }
    
    @Override
    public String toString() {
        return "\n Nome: " + nome + 
               "\n CPF: " + cpf + 
               "\n RG: " + rg + 
               "\n Gênero: " + genero + 
               "\n Salário base: " + salarioBase + 
               "\n Data de nascimento: " + dataNascimento + 
               "\n Data de admisão: " + dataAdmisao;
    }

   
}