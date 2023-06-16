package atvenumpeend;

public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');

    private final String textol;
    private final char codigo;

    private Genero(String texto, char codigo) {
        this.textol = texto;
        this.codigo = codigo;
    }

    public String getTexto() {
        return textol;
    }

    public char getCodigo() {
        return codigo;
    }
}
