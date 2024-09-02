package tema1;

import org.testng.annotations.Test;

public class afisareSalariu {

    @Test
    public void metodaTest(){
        afisareSalariuAngajat("Andrei");
    }
    //facem o metoda prin care afisam salariul unui angajat, daca acesta are prenumele Andrei
    public void afisareSalariuAngajat(String prenume){
        if (prenume=="Andrei")
        {
            System.out.println("Angajatul a carui prenume este "+prenume+" i se va afisa salariul");
        }
        else {
            System.out.println("Angajatul a carui prenume nu este "+prenume+" nu i se va afisa salariul");
        }
    }
}
