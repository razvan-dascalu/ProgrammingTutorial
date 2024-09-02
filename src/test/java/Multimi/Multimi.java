package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Multimi {
    //Multimi : array, list, set, map


    @Test
    public void metodaTest() {
        //cursantiArray();
        cursantiList();

    }

    //Afisam cursantii de la cursul de Automation
    public void cursantiArray() {
        String[] cursanti = new String[6];
        cursanti[0] = "Rares";
        cursanti[1] = "Cristina";
        cursanti[2] = "Magda";
        cursanti[3] = "Razvan";
        cursanti[4] = "Radu";
        cursanti[5] = "Andrei";

        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);

        }
    }
    //v2-list

    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Cristina");
        cursanti.add("Magda");
        cursanti.add("Razvan");
        cursanti.add("Radu");
        cursanti.add("Andrei");
        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));


        }
    }
}