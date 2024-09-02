package tema1;

import org.testng.annotations.Test;

public class Masina {

    public String nume;
    public String culoare;
    public int numarScaune;
    public int anFabricatie;
    public float greutate;
    public double inaltime;
    public char cutieDeViteza;
    public boolean areAbs;


    @Test
    public void prezentareMasina() {
        nume = "Hyundai Tucson";
        culoare = "negru";
        numarScaune = 5;
        anFabricatie = 2024;
        greutate = 1500f;
        inaltime = 1.68;
        cutieDeViteza = 'a';
        areAbs = true;


        System.out.println("Numele masinii este " + nume);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Numarul scaunelor sunt " + numarScaune);
        System.out.println("Anul fabricatiei este " + anFabricatie);
        System.out.println("Greutatea masinii este " + greutate);
        System.out.println("Inaltimea masinii este " + inaltime);
        System.out.println("Tipul cutiei de viteza este " + cutieDeViteza);
        System.out.println("Masina are Abs " + areAbs);

    }
}
