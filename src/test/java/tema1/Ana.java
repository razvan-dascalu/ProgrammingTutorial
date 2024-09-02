package tema1;

import org.testng.annotations.Test;

public class Ana {
    public String ana;
    public String are;
    public String mere;
    public String pere;
    public String prune;
    public char z;
    public String potiPlecaAcasaDupaCeItiVerificMunca;

    @Test
    public void metodaTest(){
        prezentareAna("Ana","are","mere","pere","prune",'Z',"potiPlecaAcasaDupaCeItiVerificMunca");

    }
    public void prezentareAna(String param1,String param2,String param3,String param4,String param5,char param6, String param7){
        System.out.println("Mesajul este " +param1 + param6 + param7);
        System.out.println("Mesajul este " +param2 +param6 + param7);
        System.out.println("Mesajul este " +param3 +param6 + param7);
        System.out.println("Mesajul este " +param4 +param6 + param7);
        System.out.println("Mesajul este " +param5 +param6 + param7);
        System.out.println("Mesajul este " +param1 +param6 +param2 +param6 + param3 + param6 +param4 + param6 +param5 + param6 + param7);
    }
}
