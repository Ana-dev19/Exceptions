package exceções;

public class Exercicio1 {
    public static void main(String [] args) {
        System.out.println("========TesteExceptions========");
        System.out.println("inicio do main:");
        metodo1();
        System.out.println("fim do main:");
    }
    static void metodo1() {
        System.out.println("inicio do metodo1:");
        metodo2();
        System.out.println("fim do metodo1:");
    }
    static void metodo2() {
        System.out.println("inicio do metodo2:");
        int[] array = new int[10];
        try {
            for (int i = 0; i <=15; i++) {
                array[i] =i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: tentativa de acessar indice fora dos limites do array");
            System.out.println("------------------------------------------------------");
        }
        System.out.println("fim do metodo2:");
    }
}