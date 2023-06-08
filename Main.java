package exceções;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        try {
            minhaConta.saca(1000);
        } catch (ContaExceção e){
            System.out.println(e.getMessage());
        }
    }
}
