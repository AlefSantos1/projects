package atvenumpeend;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(0, "de4", LocalDate.of(4, Month.APRIL, 4), "71424040469", "de4@gmail.com", Genero.FEMININO, endereco);
        Endereco endereco = new Endereco(logradouro, numero, complemento, cep, cidade, UnidadeFederativa.RIO_DE_JANEIRO);
        
        
        System.out.println("Informações da Pessoa");
    }
}
