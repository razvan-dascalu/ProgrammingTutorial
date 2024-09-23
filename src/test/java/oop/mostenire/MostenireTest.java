package oop.mostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest(){
        Angajat angajat=new Angajat("Popescu","Andrei",20,
                ":masculin","Timisoara","adesso","tester",
                10000,"2 ani");

        angajat.infoAngajat();

        System.out.println(angajat.getVarsta());
        angajat.setVarsta(21);
        System.out.println(angajat.getVarsta());
        angajat.mananca();

        angajat.marire();
        angajat.marire(10);
        angajat.marire("engineer");
        angajat.marire(10,"engineer");




        System.out.println();

        Sportiv sportiv = new Sportiv("Ionescu","Ion",10,"masculin",
                "Timisoara", "fotbal",true,2,true,2);

        sportiv.infoSportiv();

        System.out.println();

        Student student = new Student("Ionescu","Alina",22,"feminin",
                "Timisoara","Politehnica","It",3,true,true);

        student.infoStudent();

    }
}
