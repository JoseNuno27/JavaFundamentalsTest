package Scanners;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AnimalScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o numero de animais: ");
        int numAnimais = scanner.nextInt();
        scanner.nextLine();

        String[] AnimaisNomes = new String[numAnimais];
        int[] AnimaisPesos = new int[numAnimais];


        for (int i = 0; i < numAnimais; i++) {

            AnimaisNomes[i] = scanner.nextLine();
            System.out.print("Insira o peso do animal " + (i + 1) + ": ");
            AnimaisPesos[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nPeso dos Animais:");
        for (int i = 0; i < numAnimais; i++) {
            System.out.println(AnimaisNomes[i] + ": " + AnimaisPesos[i]);
        }

        int total = 0;
        for (int i = 0; i < numAnimais; i++) {
            total += AnimaisPesos[i];
        }
        double averageGrade = (double) total / numAnimais;
        System.out.println("\nPeso medio: " + averageGrade);

        System.out.println("\nPeso dos Animais em ordem decrescente:");
        Arrays.sort(AnimaisPesos);
        for (int i = 0; i < numAnimais; i++) {
            System.out.println(AnimaisNomes[i] + ": " + AnimaisPesos[i]);
        }
        System.out.println("\nPeso dos Animais em ordem decrescente:");
        for (int i = numAnimais - 1; i >= 0; i--) {
            System.out.println(AnimaisNomes[i] + ": " + AnimaisPesos[i]);
        }
    }


}
