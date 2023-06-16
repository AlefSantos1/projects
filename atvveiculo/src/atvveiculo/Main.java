package atvveiculo;


public class Main {
    public static void main(String[] args) {
        Veiculo car_1 = new Veiculo("Lamborghini Huracan", "AMAE95", "Amarelo", 4, 80, 325, 2);
        Livro livro_1 = new Livro("Diário de Um Banana", "Jeff Kinney", "9789896680008", 224, 37);
        
        System.out.println("Nome do veiculo: " + car_1.getNomevei());
        System.out.println("Cor do veiculo: " + car_1.getCor());
        System.out.println("Número de Passageiros: " + car_1.getNpas());
        System.out.println("Capacidade de tanque: " + car_1.getCapdtan() + " litros" );
        System.out.println("Velocidade Máxima: " + car_1.getVlm() + " km");
        System.out.println("Cosumo Médio: " + car_1.getConm() + " km/l");
        System.out.println("");
        System.out.println("Título do livro: " + livro_1.getTitulo());
        System.out.println("Autor: " + livro_1.getAutor());
        System.out.println("ISBN: " + livro_1.getIsbn());
        System.out.println("Números de Páginas: " + livro_1.getNpag());
        System.out.println("Valor de compras: " + livro_1.getValcom() + " reais" );
        
        
        
    }
    
}
