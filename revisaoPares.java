package aula0705;

import java.util.Scanner;

//Questao Revisao de Prova
public class revisaoPares {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valor = 0;
        int somaPar = 0;

        while (valor >= 0) {
            System.out.println("  ");
            System.out.println("Digite um Valor : ");
            valor = leia.nextInt();

            if (valor % 2 == 0) {
                somaPar = somaPar + valor;
            }
        }

        System.out.println("  ");
        System.out.println("a Soma dos Números Pares é : " + somaPar);
    }

}