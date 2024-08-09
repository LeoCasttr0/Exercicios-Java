
package aula_12_03;

import java.util.Scanner;

//Questao sobre Area do Triangulo
public class areaTriangulo {

    public static void main(String[] args) {

        // ler o valor do teclado
        Scanner lerTriangulo = new Scanner(System.in);

        // mensagem antes do scanner
        System.out.println("Digite a Altura do Triangulo : ");
        // esperando alguem digitar um número real
        float alt = lerTriangulo.nextFloat();
        System.out.println("Digite a Base do Triangulo : ");
        float bas = lerTriangulo.nextFloat();

        float area = alt * bas / 2;

        System.out.println("A Àrea do triangulo é : " + area);

    }
}
