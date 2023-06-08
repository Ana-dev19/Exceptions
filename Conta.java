package exceções;

public class Conta {
    private double saldo;
    private double limite;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void saca(double valor) throws ContaExceção {
        if (this.saldo + this.limite < valor) {
            throw new ContaExceção("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
}