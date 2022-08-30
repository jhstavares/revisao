package l2.exercicio4;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade em anos. ");
        int idade = input.nextInt();

        System.out.println("Digite seus meses de vida desde o último aniversario");
        int meses = input.nextInt();

        System.out.println("Digite seus dias de vida desde o inicio desse mês");
        int dias = input.nextInt();

        input.close();

        int tempoDeVidaEmDias = (idade *365) + (meses * 30) + dias;
        System.out.println("Você viveuo o total de " + tempoDeVidaEmDias + " de dias");

    }
}
