package tema1;

import org.testng.annotations.Test;

public class Mesaj {
    public String salut;
    public char M;
    public String potiPlecaAcasaDupaCeItiVerificMunca;


    @Test
    public void metodaTest() {
        prezentareMesaj("Salut", 'M',"potiPlecaAcasaDupaCeItiVerificMunca");

    }

    public void prezentareMesaj(String param1, char param2, String param3) {
        System.out.println("Mesajul transmis este " + param1 + param2 + param3);
    }

}
