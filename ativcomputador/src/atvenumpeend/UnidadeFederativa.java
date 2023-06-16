package atvenumpeend;

public enum UnidadeFederativa {
   BAHIA("Bahia", 'B'),
   SAO_PAULO("São Paulo", 'S'),
   RIO_DE_JANEIRO("Rio de Janeiro", 'R');
   
   private final String texto;
   private final char caractere;

    private UnidadeFederativa(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getRIO_DE_JANEIRO() {
        return RIO_DE_JANEIRO;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
}
