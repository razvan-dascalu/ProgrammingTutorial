package tema1;

import org.testng.annotations.Test;

public class Np {
    public String nume;
    public String prenume;
    public String potiPlecaAcasaDupaCeItiVerificMunca;

    @Test
    public void metodaTest() {
        prezentareNp("Dascalu", "Razvan","potiPlecaAcasaDupaCeItiVerificMunca");

    }

    public void prezentareNp(String param1, String param2, String param3) {
        System.out.println("Numele meu este " + param1 + param3);
        System.out.println("Prenumele meu este " + param2 + param3);
    }
}
