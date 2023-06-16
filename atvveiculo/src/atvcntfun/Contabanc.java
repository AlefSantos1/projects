package atvcntfun;


public class Contabanc {
    private Contabanc contabanc;
    private String banco;
    private float agencia;
    private String numconta;
    private String tipconta;
    private double saldoatual;
    private double limdisp;

    public Contabanc(Contabanc contabanc, String banco, float agencia, String numconta, String tipconta, double saldoatual, double limdisp) {
        this.contabanc = contabanc;
        this.banco = banco;
        this.agencia = agencia;
        this.numconta = numconta;
        this.tipconta = tipconta;
        this.saldoatual = saldoatual;
        this.limdisp = limdisp;
    }

    public Contabanc getContabanc() {
        return contabanc;
    }

    public void setContabanc(Contabanc contabanc) {
        this.contabanc = contabanc;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public float getAgencia() {
        return agencia;
    }

    public void setAgencia(float agencia) {
        this.agencia = agencia;
    }

    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(String numconta) {
        this.numconta = numconta;
    }

    public String getTipconta() {
        return tipconta;
    }

    public void setTipconta(String tipconta) {
        this.tipconta = tipconta;
    }

    public double getSaldoatual() {
        return saldoatual;
    }

    public void setSaldoatual(double saldoatual) {
        this.saldoatual = saldoatual;
    }

    public double getLimdisp() {
        return limdisp;
    }

    public void setLimdisp(double limdisp) {
        this.limdisp = limdisp;
    }

}