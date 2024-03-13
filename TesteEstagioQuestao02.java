// Este programa responde a questão 2 do questionário
// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
// sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
// escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de 
// Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class TesteEstagioQuestao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long valor = 0;

        System.out.println("Digite um valor numérico inteiro positivo que retornarei se este pertence ou não a sequência de fibonacci:");
        try {
            valor = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("Entrada inválida!");
        }

        if (verificaFibo(valor)) {
            System.out.println("O número escolhido pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número escolhido não pertence a sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibo(long valor) {
        long fibo = 1;
        long fiboAnterior = 0;
        long aux = 1;

        if (valor < 0) {
            return false;
        } else if (valor < 2) { // Se o programa chegar aqui é porque o usuário escolheu 0 ou 1, que existem na
                                // sequência.
            return true;
        }

        do {
            fibo = fibo + fiboAnterior;
            fiboAnterior = aux;
            aux = fibo;

            if (fibo == valor) {
                return true;
            }
        } while (fibo < valor);

        return false;
    }
}
