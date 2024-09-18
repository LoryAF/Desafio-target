package questao5;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        scanner.close();

        String reversedString = inverterString(input);

        System.out.println("String invertida: " + reversedString);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();


        char[] invertidos = new char[caracteres.length];


        for (int i = 0; i < caracteres.length; i++) {
            invertidos[i] = caracteres[caracteres.length - 1 - i];
        }

        return new String(invertidos);
    }
}

