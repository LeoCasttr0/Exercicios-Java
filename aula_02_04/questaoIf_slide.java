package aula_02_04;

import java.util.Scanner;
//Questão do slide sobre if

public class questaoIf_slide {

    public static void main(String[] args) {

        Scanner lerDados = new Scanner(System.in);

        int numero1, numero2;
        // pedindo numero 1
        System.out.println("Digite um Número");
        numero1 = lerDados.nextInt();
        System.out.println("");

        // pedindo numero 2
        System.out.println("Digite outro Número");
        numero2 = lerDados.nextInt();

        if (numero1 > numero2) {
            System.out.println("O Primeiro Número é maior");
        } else if (numero1 < numero2) {
            System.out.println("O Segundo Número é maior");

        }

        else {
            System.out.println("Os Números são Iguais");
        }
    }
}
