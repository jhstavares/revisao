package l2.exercicio1;

import java.util.Scanner;

public class ControlePecuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe peso do peso do peixe: ");
        double peso = input.nextDouble();
        double pesoPadrao = 50;
        double multaPadrao = 4;

        double excesso = peso - pesoPadrao;
        double multaApagar = excesso * multaPadrao;

        if (excesso > 0) {
            System.out.println("O peso do peixe é: " + peso);
            System.out.println("Multa a ser paga é: " + multaApagar);
        } else {
            System.out.println("O peso do peixe é: " + peso);
            System.out.println("Você não precisa pagar multa: ");

        }
    }
}
