package Multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //Multimi : array, list, set, map


    @Test
    public void metodaTest() {
        //cursantiArray();
//        cursantiList();
//          listaMasini();
//        mapExample();
//        tariOrase();
        caietRetete();
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

    //Definim o multime de masini din care afisam doar masinile de pe pozitii impare
    public void listaMasini() {
        List<String> masini = new ArrayList<>();
        masini.add("Dacia");
        masini.add("Peugeot");
        masini.add("Renault");
        masini.add("VW");
        masini.add("Tatra");
        for (int index = 0; index < masini.size(); index++) {

            if (index % 2 != 1){
                System.out.println("Numele masinii este " + masini.get(index));
            }
         }
       }

    //Map : key = value
    //Parcurgerea se face pe baza keylor (folosind un set )
    public void mapExample(){
        Map<String,String> elemente=new HashMap<>();
        elemente.put("Masina","Peugeot");
        elemente.put("Persoana","Rares");
        elemente.put("Telefon","Samsung");
        for (String key: elemente.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + elemente.get(key));
        }
     }

     //afisam tara cu anumite orase
     public void tariOrase() {
         Map<String, List<String>> obiecte = new HashMap<>();

         List<String> oraseRomania = Arrays.asList("Cluj", "Oradea", "Timisoara");
         List<String> oraseItalia = Arrays.asList("Roma", "Milano", "Turin");
         List<String> oraseSpania = Arrays.asList("Barcelona", "Madrid", "Valencia");

         obiecte.put("Romania", oraseRomania);
         obiecte.put("Italia", oraseItalia);
         obiecte.put("Spania", oraseSpania);

         for (String key : obiecte.keySet()) {
             System.out.println("Tara este " + key);
             System.out.println("Orasele sunt " + obiecte.get(key));

         }
     }
     public void caietRetete(){
        Map<String, List<String>> ingrediente=new HashMap<>();

        List<String> ingredienteSupaPui=Arrays.asList("CarnePui","Taitei","Legume","Apa");
        List<String> ingredienteSarmale=Arrays.asList("Varza","Carne","Orez");
        List<String> ingredientePapanasi=Arrays.asList("Faina","Apa","Zahar","DulceataZmeura");

        ingrediente.put("SupaDePui", ingredienteSupaPui);
        ingrediente.put("Sarmale" , ingredienteSarmale);
        ingrediente.put("Papanasi", ingredientePapanasi);

        for (String key : ingrediente.keySet()){
            System.out.println("Reteta este " + key);
            System.out.println("Ingredientele sunt " + ingrediente.get(key));

        }




     }

}
