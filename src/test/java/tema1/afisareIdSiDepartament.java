package tema1;

import org.testng.annotations.Test;

public class afisareIdSiDepartament {

    @Test
    public void metodaTest() {
        afisareIdSiDepartament("Popescu");
    }
    //facem o metoda prin care afisam Id-ul si Departamentul unui angajat, daca numele acestuia este Popescu
    public void afisareIdSiDepartament(String nume) {
        if (nume == "Popescu") {
            System.out.println("Angajatul a carui nume este " + nume + " i se va afisa Id-ul si departamentul din care face parte");
        } else {
            System.out.println("Angajatul a carui nume nu este " + nume + " nu i se va afisa Id-ul si departamentul din care face parte");
        }
    }
}
