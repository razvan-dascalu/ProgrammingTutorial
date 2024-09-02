package tema1;

import org.testng.annotations.Test;

public class mesajSalut {
    public String HelloWorld;
    public String potiPlecaAcasaDupaCeItiVerificMunca;

    @Test
        public void metodaTest() {

        prezentareMesaj("Hello World","potiPlecaAcasaDupaCeItiVerificMunca");

    }
    public void prezentareMesaj(String param1, String param2) {
        System.out.println("Mesajul este " + param1 +param2);
    }
    }







