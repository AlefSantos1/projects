package atvcntfun;

public class Funcionario {
    private Contabanc contbanc;
    private float codfunc;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;

    public Funcionario(Contabanc contbanc, float codfunc, String nome, String endereco, int telefone, String email) {
        this.contbanc = contbanc;
        this.codfunc = codfunc;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public Contabanc getContbanc() {
        return contbanc;
    }

    public void setContbanc(Contabanc contbanc) {
        this.contbanc = contbanc;
    }

    public float getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(float codfunc) {
        this.codfunc = codfunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}