package Encapsulamentoexe;

public class Main {
    public static void main(String[] args) {
    
    Pessoa personagem = new Pessoa();
    
    personagem.setNome("Vitória");
    personagem.setIdade(25);
    personagem.setPeso(68);
    personagem.setAltura(1.67);
     
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Idade: " + personagem.getIdade());
        System.out.println("Peso: " + personagem.getPeso() + " quilos");
        System.out.println("Altura: " + personagem.getAltura());
    
    } 
    
}