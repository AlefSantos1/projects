package Enumatv;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    private final String textol;

    private Setor(String textol) {
        this.textol = textol;
    }

    public static Setor getFINANCEIRO() {
        return FINANCEIRO;
    }

    public static Setor getRECURSOS_HUMANOS() {
        return RECURSOS_HUMANOS;
    }

    public static Setor getVENDAS() {
        return VENDAS;
    }

    public static Setor getMARKETING() {
        return MARKETING;
    }

    public String getTextol() {
        return textol;
    }
    
    
}
