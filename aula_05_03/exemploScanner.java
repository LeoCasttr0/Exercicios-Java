package aula_05_03;

import java.util.Scanner;

public class exemploScanner {
     public static void main(String[] args) {
        
        // Quando o sublinhado for amarelo : variavel não usada ou outra coisa, erro não.

        Scanner ent = new Scanner(System.in);

        //Pergunta: 
     System.out.println("em que ano você nasceu ?");

     //Declarando variaveis inteiras
     // uma vai guardar o ano e a outra a sua idade.
     int anoNascimento = ent.nextInt();
     int idade = 2024-anoNascimento;

     System.out.println("Sua idade é "+idade);

     }
}

//ANOTAÇÕES !!!!!!!!!!!!
//Tipos de variaveis :

// - Tipos Primitivos :

//INTEIROS: Byte : de 0 até 127 || Short: permite representar valores de -32768 a 32767 || Int : numeros inteiros ||
// Long : É o tipo de dado capaz de armazenar 64 bits de informação, 
//ou seja, que pode representar um número inteiro qualquer entre -9.223.372.036.854.775.808L e 9.223.372.036.854.775.807L. 

//REAIS: Float e Double. ( números quebrados)
//exemplo: float raio 3.4f; --> o f no final serve para o java reconhecer o float de fato.

//Char : caracteres (letras ou simbolos)
//Boolean : verdadeiro ou falso;


//String : classe que surgiu de uma quantidade de caracteres.
//para cada tipo de dado há uma leitura diferente : 
//exemplo : 3.4 String sem caractere de espaço:
//String palavra = entrada.next();
//3.5 String com caractere de espaço:
//String frase = entrada.nextLine();
//3.6 Valor byte
//byte idade = entrada.nextByte();
