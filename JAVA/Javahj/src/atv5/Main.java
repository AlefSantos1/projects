package atv5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
       String nomeUsuarioPadrao = "Alef";
       int senhaPadrao = 678;

    System.out.println("Digite o seu nome:");
    String nomeUsuario = ler.nextLine();
    System.out.println("Digite a sua senha:");
    int senha = ler.nextInt();
        
    boolean resultadoNome = nomeUsuario.equals(nomeUsuarioPadrao);
    boolean resultadoSenha = (senha == senhaPadrao);

    if (resultadoNome && resultadoSenha) {
    System.out.println("Bem-vindo, usuário logado!");
} else {
    System.out.println("Nome de usuário ou senha inválidos");
}

        
}
    
}