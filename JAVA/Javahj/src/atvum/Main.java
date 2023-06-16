package atvum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva o seu nome:");
        
        System.out.println("Digite sua primeira nota:");
        int a = ler.nextInt();
        System.out.println("Digite a sua segunda nota;");
        int b = ler.nextInt();
        
        int media = (a+b)/2;
        
       if (media < 7) {
         System.out.println(nome + ", sua media foi " + media + ", e infelizmente você foi reprovado.");
        } else {
         System.out.println(nome + ",parabéns, sua media foi " + media + ", e você foi aprovado!");
        }

    }
}
