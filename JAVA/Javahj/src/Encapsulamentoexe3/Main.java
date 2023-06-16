package Encapsulamentoexe3;


public class Main {
public static void main(String[] args) {
        
Pet pet_1 = new Pet();        
Pet pet_2 = new Pet();

       pet_1.setNome("Dog");
       pet_1.setIdade(7);
       pet_1.setPorte("Médio");
       pet_1.setAlimentacao("Ração, frutas, vegetais e carne");
       
       pet_2.setNome("Ararinha");
       pet_2.setIdade(4);
       pet_2.setPorte("Pequeno");
       pet_2.setAlimentacao("Alpiste, frutas e vegetais");
         
        System.out.println("Pet 1");
        System.out.println("Nome: " + pet_1.getNome());
        System.out.println("Idade: " + pet_1.getIdade());
        System.out.println("Porte: " + pet_1.getPorte());
        System.out.println("Alimetação: " + pet_1.getAlimentacao());
        System.out.println("");
        System.out.println("Pet 2");
        System.out.println("Nome: " + pet_2.getNome());
        System.out.println("Idade: " + pet_2.getIdade());
        System.out.println("Porte: " + pet_2.getPorte());
        System.out.println("Alimentação: " + pet_2.getAlimentacao());
       
    }
   
}