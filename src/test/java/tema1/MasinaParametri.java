package tema1;

import org.testng.annotations.Test;

public class MasinaParametri {

    public String nume;
    public int anFabricatie;
    public float greutate;
    public double inaltime;
    public char cutieDeViteza;
    public boolean areAbs;


    @Test
    public void metodaTest() {

        prezentareMasina("Hyundai Tucson", 2024, 1500f, 1.68, 'a', true);
        prezentareMasina("BMW",2021,1400f,1.69,'m',false);
        prezentareMasina("Opel Astra",2022,1300f,1.70,'a',false);
        prezentareMasina("Audi",2023,1600f,1.69,'m',true);
    }

    public void prezentareMasina(String param1,int param2,float param3,double param4,char param5,boolean param6){
        System.out.println("Numele masinii este " + param1);
        System.out.println("Anul fabricatiei este " + param2);
        System.out.println("Greutatea masinii este " + param3);
        System.out.println("Inaltimea masinii este " + param4);
        System.out.println("Tipul cutiei de viteza este " + param5);
        System.out.println("Masina are Abs " + param6);

    }
}
