package Prodcam;

public class Main {
    public static void main(String[] args) {
        Calca calca = new Calca ("Calvin Klein", "Preto", "M", 169.99);
        Camisa camisa = new Camisa ("Tommy Hilfiger", "Azul", "GG", 149.99);
        Sapato sapato = new Sapato ("Adidas", "Preto", "44", 225.23);
        
        Produto produto = new Produto(camisa, calca, sapato);
        
        System.out.println("Informação dos Produtos:");
        
        System.out.println("");
        
        System.out.println("Camisa ");
        System.out.println("Marca " + produto.getCamisa() .getMarca());
        System.out.println("Cor: " + produto.getCamisa() .getCor());
        System.out.println("Tamanho: " + produto.getCamisa() .getTamanho());
        System.out.println("Preço: " + "R$ " + produto.getCamisa() .getPreco());
        
        System.out.println(""); 
        
        System.out.println("Calça ");
        
        System.out.println("Marca: " + produto.getCalca() .getMarca());
        System.out.println("Cor: " + produto.getCalca() .getCor());
        System.out.println("Tamanho: " + produto.getCalca() .getTamanho());
        System.out.println("Preço: " + "R$ " + produto.getCalca() .getPreco());
        
        System.out.println("");
        
        System.out.println("Sapato ");
        
        System.out.println("Marca: " + produto.getSapato() .getMarca());
        System.out.println("Cor: " + produto.getSapato() .getCor());
        System.out.println("Tamanho: " + produto.getSapato() .getTamanho());
        System.out.println("Preço: " + "R$ " + produto.getSapato() .getPreco());
    }
}
