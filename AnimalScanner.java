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
            System.out.print("Insira o Nome do Animal " + (i + 1) + ": ");
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
    }
}
