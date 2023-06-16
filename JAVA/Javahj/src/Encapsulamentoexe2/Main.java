package Encapsulamentoexe2;


public class Main {
    public static void main(String[] args) {
        
Livro livro_1 = new Livro();        
Livro livro_2 = new Livro();

       livro_1.setTitulo("Bird Box");
       livro_1.setAutor("Josh Malerman");
       livro_1.setNumeropg(272);
       livro_1.setPreco(40);
       
       livro_2.setTitulo("A 5ª Onda");
       livro_2.setAutor("Rick Yancey");
       livro_2.setNumeropg(384);
       livro_2.setPreco(49);

        System.out.println("Livro 1");
        System.out.println("Título: " + livro_1.getTitulo());
        System.out.println("Autor: " + livro_1.getAutor());
        System.out.println("Número de páginas: " + livro_1.getNumeropg());
        System.out.println("Preço: " + livro_1.getPreco());
        System.out.println("");
        System.out.println("Livro 2");
        System.out.println("Título: " + livro_2.getTitulo());
        System.out.println("Autor: " + livro_2.getAutor());
        System.out.println("Número de páginas: " + livro_2.getNumeropg());
        System.out.println("Preço: " + livro_2.getPreco());
       
    }
   
}


    