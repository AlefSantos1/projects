package atv4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota:");
        int a = ler.nextInt();
        System.out.println("Digite a sua segunda nota:");
        int b = ler.nextInt();
        
        int media = (a+b) /2;
        
         if (media > 7){
            System.out.println("Sua media é " + media + ", e você tá aprovado");
            } else if (media < 5){
            System.out.println("Sua media é " + media + ", e você tá reprovado");
           } else if (media >= 5 && media <= 7) {
         System.out.println("Sua media é " + media + ", e você tá na recuperação");
        }
         
        
    }
    
}
