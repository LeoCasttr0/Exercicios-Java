package aula_12_03;

import java.util.Scanner;

public class Antecessor {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        // Questao sobre número antecessor
        System.out.println("Digite um Número e Descubra seu Antecessor : ");
        int Numero = lerDados.nextInt();
        int numeroSub = Numero - 1;
        System.out.println("O Número Antecessor de " + Numero + " é: " + numeroSub);
    }
}
