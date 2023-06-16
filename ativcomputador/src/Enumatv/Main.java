package Enumatv;

public class Main {
    public static void main(String[] args) {
     Funcionario funcionario1 = new Funcionario(1243, "Alef", 7.857, Setor.MARKETING, Genero.MASCULINO, 19);   
        
        System.out.println("Informações do funcionário: ");
        System.out.println("");
        
        System.out.println("Id: " + funcionario1.getId());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + "R$ " + funcionario1.getSalario());
        System.out.println("Setor: " + funcionario1.getSetor().getTextol());
        System.out.println("Gênero: " + funcionario1.getGenero().getTexto());
        System.out.println("Idade: " + funcionario1.getIdade());
        
        
    }
    
}