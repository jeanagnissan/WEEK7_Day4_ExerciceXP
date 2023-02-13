package exercice2;

import java.time.LocalDate;
import java.util.Scanner;

public class Calcul {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le 1er nombre svp!");
        int nombre1 = scanner.nextInt();

        System.out.println("Entrez le 2e nombre svp!");
        int nombre2 = scanner.nextInt();

        System.out.println("Entrez le 3e nombre svp!");
        int nombre3 = scanner.nextInt();

        System.out.println("Le produit est: " + produit(nombre1, nombre2, nombre3));
        System.out.println("La somme est: " + somme(nombre1, nombre2, nombre3));
        System.out.println("La moyenne est: " + moyenne(nombre1, nombre2, nombre3));
        System.out.println("Le maximum est: " + plusGrand(nombre1, nombre2, nombre3));
        System.out.println("Le minimum est: " + plusPetit(nombre1, nombre2, nombre3));
    }

    private static double produit(int n1, int n2, int n3) {
        return Math.multiplyExact(Math.multiplyExact(n1, n2), n3);
    }

    private static double somme(int n1, int n2, int n3) {
        return Math.addExact(Math.addExact(n1, n2), n3);
    }

    private static double moyenne(int n1, int n2, int n3) {
        return somme(n1, n2, n3) / 3;
    }

    private static int plusGrand(int n1, int n2, int n3) {
        return Math.max(Math.max(n1, n2), n3);
    }

    private static int plusPetit(int n1, int n2, int n3) {
        return Math.min(Math.min(n1, n2), n3);
    }
}
