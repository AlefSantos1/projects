package atvfem;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marta", Genero.FEMININO);
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Genero: " + pessoa.getGenero().getTexto());
        System.out.println("Genero com caracter: " + pessoa.getGenero().getCaracter());
        
    }


    
}