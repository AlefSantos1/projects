package ativcomputador;


public class Main {


    public static void main(String[] args) {
       
        PlacaMae placaMae = new PlacaMae ("Aorus", "B550W", 1700);
        Memoria memoria = new Memoria ("Kingston", "Fury", "8GB");
        Processador processador = new Processador ("Intel", "i7", "5.0");
        DispositivoArmazenamento dispositivoArmazenamento = new  DispositivoArmazenamento ("", "", 0);
        
        Computador pc = new Computador(placaMae, memoria, processador, dispositivoArmazenamento);
        System.out.println("Informações do computador:");
        System.out.println("Processador: ");
        System.out.println("\tMarca: " + pc.getProcessador() .getMarca());
        System.out.println("\tModelo: " + pc.getProcessador() .getModelo());
        System.out.println("\tFrequência: " + pc.getProcessador() .getFrequencia());
        
        System.out.println("");
        
        System.out.println("Placa-Mãe:");
        System.out.println("\tMarca: " );
        System.out.println("\tModelo: ");
        System.out.println("\tSoquete: ");
        
        
    }
    
}
