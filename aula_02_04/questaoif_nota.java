package aula_02_04;

import java.util.Scanner;

public class questaoif_nota {

    public static void main(String[] args) {

        Scanner lerDados = new Scanner(System.in);

        System.out.println("Digite a nota da prova");
        float nota = lerDados.nextFloat();

        System.out.println("Digite a Frequência do aluno ");
        int frequencia = lerDados.nextInt();

        if (nota < 6 && frequencia < 75) {
            System.out.println("Aluno de Reprovado :( ");
        } else {
            System.out.println("Aluno Aprovado !");
        }
    }
}
