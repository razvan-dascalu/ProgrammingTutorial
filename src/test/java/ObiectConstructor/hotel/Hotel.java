package ObiectConstructor.hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Hotel {
    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public boolean micDejun;
    public int numarEtaje;
    public List<String> facilitati;
    public int pretPornire;



    public Hotel() {
        nume = "Imperial House";
        adresa = "Strada Mamaia";
        tara = "Romania";
        oras = "Constanta";
        stele = "***";
        numarCamere = 60;
        micDejun = true;
        numarEtaje = 6;
        facilitati = Arrays.asList("Wifi", "Hartie igienica", "TV", "Frigider", "Loc parcare");
        pretPornire = 1000;

    }




        public void prezentareHotel(){
            System.out.println("Numele hotelului este : " +nume);
            System.out.println("Strada hotelului este : " +adresa);
            System.out.println("Tara hotelului este : " + tara);
            System.out.println("Numar stele hotel : " +oras;
            System.out.println("Numar camere : " + numarCamere);
            System.out.println("Mic dejun inclus : " +micDejun);
            System.out.println("Numar etaje : " + numarEtaje);
            System.out.println("Facilitatile sunt : " +facilitati);

        }

        public void pretOferta(HashMap<String, String> oferta){
            for (String optiune : oferta.keySet()){
                if(optiune.equals("Durata oferta")){
                    //Clientul are dorinta de a avea oferta cu valabilitate mai mare
                    //Se calculeaza pretul pe baza la diferite intervale


                    String[] parts = oferta.get(optiune).split(" ");
                    int number = Integer.parseInt(parts[0]);
                    if(number<5){
                        pretPornire=pretPornire+200;
                    }
                    if(number==3){
                        pretPornire=pretPornire+200;
                    }
                    else{
                        pretPornire=pretPornire+800;
                    }

                }
            }

        }


}

