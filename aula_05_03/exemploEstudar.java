package aula_05_03;

//Questão sobre Entrada de Dados
import java.util.Scanner;

public class exemploEstudar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu Nome ?");
        String nome = in.nextLine();
        System.out.println("Qual sua idade ?");
        int idade = in.nextShort();
        System.out.println("Olá " + nome + ", Você têm " + idade + " Anos !");
    }
}
