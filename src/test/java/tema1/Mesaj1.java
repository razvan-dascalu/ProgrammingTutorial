package tema1;

import org.testng.annotations.Test;

public class Mesaj1 {
    public String hello;
    public char h;
    public String potiPlecaAcasaDupaCeItiVerificMunca;

    @Test
    public void metodaTest(){
        prezentareMesaj1("Salut", 'H',"potiPlecaAcasaDupaCeItiVerificMunca");

    }
    public void prezentareMesaj1(String param1, char param2, String param3){
        System.out.println("Mesajul transmis este " + param2 + param1 + param3);
    }
}
