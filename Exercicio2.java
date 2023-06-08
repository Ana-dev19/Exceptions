package exceções;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir ->");
        boolean valido = false;
        do {
            try {
                System.out.println("Informe o primeiro valor: ");
                System.out.println("-----------------------------");
                int x = teclado.nextInt();
                System.out.println("Informe o segundo valor: ");
                System.out.println("-----------------------------");
                int y = teclado.nextInt();
                double r = (x / y);
                System.out.println("O resultado da divisão é: " + r);
                valido = true;
            } catch (ArithmeticException e) {
                System.out.println("Erro: tentativa de divisão por zero");
            }
        } while (!valido);

        }
    }