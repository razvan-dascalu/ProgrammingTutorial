package tema1;

import org.testng.annotations.Test;

public class varsta {
    public String varsta;
    public String potiPlecaAcasaDupaCeItiVerificMunca;

    @Test
    public void metodaTest (){

        prezentareVarsta("29","potiPlecaAcasaDupaCeItiVerificMunca");

    }
    public void prezentareVarsta(String param1,String param2){
        System.out.println("Varsta mea este " + param1 + param2);
    }

}
