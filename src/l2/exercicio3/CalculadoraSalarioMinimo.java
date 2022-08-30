package l2.exercicio3;

import java.util.Scanner;

public class CalculadoraSalarioMinimo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario: ");
        double salario = input.nextDouble();
        double salarioMinino = 1212;
        double qtdSalarioMinimo = salario / salarioMinino;

        System.out.printf("Você  ganha %.2f de salarios minimo em 2022", qtdSalarioMinimo);

    }
}
