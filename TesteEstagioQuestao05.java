// Este programa responde a questão 5 do questionário
// 5) Escreva um programa que inverta os caracteres de um string.


// IMPORTANTE:

// a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

// b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class TesteEstagioQuestao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "";

        System.out.println("Digite uma string que vou invertê-la:");
        try {
            texto = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Entrada inválida!");
        }

        System.out.println("A string digitada invertida fica assim: " + inverteString(texto));
    }

    public static String inverteString(String texto) {
        String invertido = ""; 
        for (int i = texto.length(); i > 0; i--) { 
            invertido += texto.charAt(i-1); 
        }

        return invertido;
    }
}
