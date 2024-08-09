
package aula_12_03;

public class operadores {

    // Método principal
    public static void main(String[] args) {

        // Atribuições
        String nome = "Leonardo";
        int numero = 5;
        char sexo = 'M';

        // Operadores Aritmeticos
        float soma = 10.2f + 23.5f;
        int subtracao = 20 - 2;
        int multiplicacao = 3 * 5;
        int modulo = 18 % 3; // Resto da Diferença

        System.out.println(" ");
        System.out.println("EXEMPLO OPERAÇÕES :");
        System.out.println("A Soma é: " + soma);
        System.out.println("A Subtração é: " + subtracao);
        System.out.println("A Multiplicacao é: " + multiplicacao);
        System.out.println("O Resto da Divisao é: " + modulo);

        // EXEMPLO 2: NUMERO NEGATIVO

        System.out.println(" ");
        System.out.println("EXEMPLO CONCATENAÇÃO :");
        String primerioNome = "Leonardo";
        String segundoNome = "Castro";
        String nomeCompleto = primerioNome + " " + segundoNome;
        System.out.println("O seu Nome Completo é: " + nomeCompleto);
        System.out.println(" ");

        // EXEMPLO 3: NUMERO NEGATIVO
        int numeroPositivo = 5;
        int outroNumeroPositivo = +4;

        System.out.println("EXEMPLO DEIXANDO O NUMERO NEGATIVO: " + (-numeroPositivo));
        System.out.println("Número Positivo: " + outroNumeroPositivo);

        numeroPositivo = -5;
        System.out.println("O Novo Valor da Variavel: "
                + numeroPositivo);
        numeroPositivo = -numeroPositivo;

        System.out.println("Menos com menos é Mais: (-(-5)): " + numeroPositivo);

        // EXEMPLO 4: INCREMENTO
        System.out.println("EXEMPLO INCREMENTO ");
        int incrementoUm = 10;
        System.out.println("incremento da variavel (10+1): " + incrementoUm++);

        int incrementoDois = 4;
        System.out.println("Incremento dois: " + (++incrementoDois));
    }
}