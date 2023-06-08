package exceções;

public class Conta2 {
        private double saldo;
        private double limite;

        public void deposita(double valor) {
            this.saldo += valor;
        }

        public void setLimite(double limite) {
            this.limite = limite;
        }
        public void saca(double valor) throws ContaExcecao {
            if (this.saldo + this.limite < valor) {
                throw new ContaExcecao("Saldo insuficiente", this.saldo);
            }
            this.saldo -= valor;

            }
    {
    }
}