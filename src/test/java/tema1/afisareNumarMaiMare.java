package tema1;

import org.testng.annotations.Test;

public class afisareNumarMaiMare {

    @Test
    public void metodaTest(){
        afisareNumereFor(300);
    }

    //afisam numarul unui departament, daca acesta este mai mare decat 287
    public void afisareNumereFor (int capat){
        for (int index = 287; index < capat; index++){
            System.out.println("Afisare numar mai mare decat " +index);
        }
    }
}
