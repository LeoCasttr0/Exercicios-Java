package aula0705;

import java.util.Scanner;

//Estrutura de Repetição FOR prova AV2

public class revisaoFor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("");
        System.out.println("Digite primeiro o valor : ");
        int n1 = leia.nextInt();

        System.out.println("");
        System.out.println("Digite segundo o valor : ");
        int n2 = leia.nextInt();

        for (int i = n1; i <= n2; i++) {

            if (i % 2 == 0) {
                System.out.println("o Número Par entre esses dois é : " + i);
            }

        }

    }
}
