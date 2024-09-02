package ObiectConstructor;

import java.util.List;

public class Masina {


    //Constructor = are ca rol sa initializez varibilele unei clase
    //recunoastem un constructor intr-o clasa dupa numele acestuia
    //de cele mai multe ori constructorul este public
    //intr-o clasa putem avea mai multi constructori care se diferentiaza prin numarul/tipul de parametri
    //o clasa contine intodeauna un constructor default (nu are parametri)
    //constructorii pot fi de doua tipuri : cu parametri / fara parametri

    //obiecte = instanta unei clase
    //dintr-o clasa putem sa definim mai multe obiecte care sa aibe valori diferite pentru proprietati
    //in momentul cand avem un obiect de tipul unei clase putem accesa variabile/metode din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantul cheie "new"
    //structura : tipObiect numeObiect = new tipObiect();
    //facem un obiect de tipul x;  x = numele clasei (Masina Dacia = new Masina ());


    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;



    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;


    }

    public Masina(String model, String marca, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.model = model;
        this.marca = marca;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Anul masinii este " + an);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Dotarile interioare sunt urmatoarele : ");
        for (int i = 0; i < dotariInterioare.size(); i++) {
            System.out.println(dotariInterioare.get(i));
        }
        System.out.println("Motorizare: " + motorizare);

        }
    }

    //determinam impozitul in functie de anul de fabricatie
    //<2000 ~~ 500 RON
    //2005<x<2015 ~~ 300 RON
    //>2020 ~~ 100 RON

//    public void calculImpozit() {
//        if (an <= 2000) {
//            System.out.println("Impozitul pe masina este 500");
//        }
//        else if (an >= 2005 && an <= 2015) {
//            System.out.println("Impozitul este 300 RON");
//        }
//        else if (an >= 2020) {
//            System.out.println("Impozitul este 100 RON");
//        }
//    }
//
////determinam pretul standard si pretul final in functie de dotarile masinii
//
//public void calculPret(){
//    if(pret!=0){
//        System.out.println("Pretul de pornire: ");
//    }
//    if (dotariInterioare.isEmpty()) {
//        System.out.println("Pretul final este : " + pret);
//    }
//    else {
//        int dotari = 0;
//        for (int i=0, i<dotariInterioare.size();i++){
//            switch (dotariInterioare.get(i)){
//                case "Radio":
//                    dotari=dotari+1000;
//                    break;
//                case "Airbag";
//                    dotari=dotari+800;
//                    break;
//                case"Aer conditionat":
//                    dotari=dotari+1500;
//                case "Scaune incalzite":
//                    dotari=dotari+3000;
//                    break;
//                case "Navigatie";
//                    dotari=dotair+400;
//                    break;
//            }
//        }
//        System.out.println("Pretul dotarilor este " + pret);
//
//        pretFinal=pret+dotari;
//        System.out.println("Pretul final este " + pretFinal);



        //definiti sportivi , definim proprietati,constructor sport de echipa, constructor individual
        // nume prenume echipa, capitan sau nu, bonus de performanta pe langa salariu in functie de sport pozitie performanta


    public void calculPret(){...}

    public void calculReducere(int procentReducere) {
        pretFinal =((100-procentReducere)*pretFinal)/100;


        System.out.println("S-a aplicat o reduicere de " + procentReducere + " din pretul final.");
        System.out.println("Pretul finl cu reducere este : " + pretFinal);




    }

    }


















