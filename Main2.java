package exceções;

public class Main2 {
    public static void main(String[] args) {
        Conta2 minhaConta = new Conta2();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        try {
            minhaConta.saca(1000);
        } catch (ContaExcecao e) {
            System.out.println(e.getMessage());
            System.out.println("-------------------------------");
            System.out.println("Saldoa atual: " + e.getSaldo());
        }
    }
}
