import exercice1.Cercle;
import exercice2.Calcul;
import exercice3.GenerateurNombre;

public class Main {
    public static void main(String[] args) {
        //Exercice 1
        System.out.println("Le perimetre: " + Cercle.perimetre(2.6));
        System.out.println("L'aire est " + Cercle.area(2.6));

        //Exercice 2
        Calcul.execute();

        //Exercice 3
        GenerateurNombre.execute();
    }
}