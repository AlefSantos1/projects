package atvexe3;

public class Main {
    public static void main(String[] args) {
        
        String nomeUsuario = "Marta";
        int senha = 123;
        
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);
        
        System.out.println("O nome do usuário está correta? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
    
}
