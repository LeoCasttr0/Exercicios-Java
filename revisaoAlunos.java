package aula0705;

import java.util.Scanner;

//questao revisao de prova
public class revisaoAlunos {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // variável criada para media da turma
        // e variável Auxiliar
        float media = 0, aux = 0;

        System.out.println(" ");
        System.out.println("*** Questão Revisao de Prova ***");
        System.out.println("Olá professor(a) , quantos Alunos há em sua sala de aula ?");

        int QuantAlunos = leia.nextInt();

        // WHILE : Se a variavel auxiliar for menor ou igual a quantidade de alunos, o
        // loop vai reperir :
        while (aux <= QuantAlunos) {

            System.out.println(" ");
            System.out.println("Digite a Nota deste Aluno : ");
            float nota = leia.nextFloat();
            media = media + nota;
            aux++;
        }

        // a Média da Turma é igual a : Média Dividida pela Quantidade de Alunos
        System.out.println("a Media da Turma é : " + (media / QuantAlunos));
    }
}
