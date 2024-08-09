package aula_02_04;

import java.util.Scanner;

//Questão sobre POLÍGONO :

// Carlos é um engenheiro civil e precisa criar um programa que verifica se uma determinada figura geométrica representa um Polígono.
// Ajude Carlos a criar esse programa, para isso considere: 
//− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
//− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

public class questaoIf_3 {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Vamos verificar se a figura que você digitar é um polígono !");
        System.out.println("");

        System.out.println("Digite o numero de lados da sua figura geometrica :");
        int quantLados =  lerDados.nextInt();

        if ( quantLados < 3) {
            System.out.println(" NÃO É UM POLÍGONO");
        }
       
        if ( quantLados > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }

    
    }
}
