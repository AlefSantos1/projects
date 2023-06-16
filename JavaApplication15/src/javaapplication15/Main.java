
package javaapplication15;


public class Main {

    
    public static void main(String[] args) {
        Soma Soma = new Soma();
        Divisao Divisao = new Divisao();
        Subtracao Subtracao = new Subtracao();
        Multiplicacao Multiplicacao = new Multiplicacao();
        
        System.out.println("A soma é" + Soma.calcular(12, 5));
        System.out.println("A Divisao é" + Divisao.calcular(5, 5));
        System.out.println("A Subtracao é" + Subtracao.calcular(8, 4));
        System.out.println("A Multiplicacao é" + Multiplicacao.calcular(8, 4));
         
        
        
    }
    
}
