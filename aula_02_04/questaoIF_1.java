package aula_02_04;

import java.util.Scanner;

//Questão sobre validação de senha :

//João em seu estágio precisa criar um programa que verifique a validade de uma senha fornecida pelo usuário.
// A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: 
//ACESSO PERMITIDO caso a senha seja válida.
//ACESSO NEGADO caso a senha seja inválida.

public class questaoIF_1 {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        // Pedindo o nome do Usuário
        System.out.println("Bem vindo ao Sistema!" + "\n" + "Digite seu nome de Usuário :");
        String usuario = lerDados.nextLine();
        System.out.println("");

         // Pedindo a senha do Usuário
        System.out.println("Olá , " + usuario + " Bem vindo ao sistema!" + "\n" + "Digite sua Senha de Acesso : ");
        int senha = lerDados.nextInt();

        //Verificando se a senha digitada é a correta
        if (senha == 1234) {
            System.out.println("SENHA CORRETA !");
        } else {
            System.out.println("SENHA INCORRETA , TENTE NOVAMENTE!");
        }
    }
}
