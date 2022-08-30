package l2.exercicio2;

import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu peso em kg");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura em metros");
        double altura = input.nextDouble();


        input.close();

        double imc = peso / (altura * altura);
        System.out.printf("Seu imc é: %.2f", imc);
    }
}
