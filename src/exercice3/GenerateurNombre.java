package exercice3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class GenerateurNombre {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer la valeur de X");
        int numberX = scanner.nextInt();

        System.out.println("Entrer la valeur de N");
        int numberN = scanner.nextInt();

        Random random = new Random();
        for (int compteur = 0; compteur < numberN; compteur++) {
            System.out.println(random.nextInt(1, numberX + 1));
        }

    }
}
