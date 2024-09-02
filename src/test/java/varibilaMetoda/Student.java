package varibilaMetoda;

import org.testng.annotations.Test;

public class Student {

    // Acesta este un comentariu
    // clasa = sablon care defineste comportamentul unei entitati din viata reala
    // intr-un fisier Java, recunoastem o clasa, dupa cuvantul cheie "class"
    // este obligatoriu ca o clasa sa aiba un nume
    // intr-un fisier Java putem avea mai multe clase diferentiate prin numele acestora ( nu se face niciodata )
    // o clasa contine variabile si metode

    //variabile = proprietatea unei clase
    //variabila este de doua feluri : globala si locala
    //variabila globala = variabila pe care o definesti la inceputul clasei si are vizibilitate asupra intregului fisier
    //variabila locala = variabila pe care o definesti intr-o metoda ce are vizibilitate doar in metoda respectiva
    //variabila globala trebuie sa contina un acces control (public), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //Metoda = actiunea unei clase
    //o clasa poate avea mai multe metode, care se diferentiaza prin numele lor
    //metodele pot fi de doua feluri : void si return
    //o metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //o metoda cu void trebuie sa contina : acces contol(public), void, numeMetoda () {}


    @Test
    public void prezentareStudent() {
        nume = "Dascalu";
        prenume = "Razvan";
        varsta = 29;
        inaltime = 1.78;
        greutate = 80.8f;
        adresa = "Calea Grivitei, nr 15";
        sex = 'm';
        areRestante = true;

// concatenare = lipirea a unu sau mai multe stringuri, lipirea se face cu "+"

        System.out.print(nume+ " ");
        System.out.print(prenume+ " ");
        System.out.print(varsta);

        System.out.println("Numele studentului este "+nume);
        System.out.println("Prenumele studentului este "+prenume);

        //print = afiseaza valoarea si ramane pe randul curent
        //println = afiseaza valoearea si sare la randul urmator

        System.out.println("Nume studentului este "+prenume);
        System.out.println("Prenumele studentului este "+prenume);
        System.out.println("Varsta studentului este "+varsta);
        System.out.println("Inaltimea studentului este "+inaltime);
        System.out.println("Greutatea studentului este "+greutate);
        System.out.println("Adresa studentului este "+adresa);
        System.out.println("Sexul studentului este "+sex);
        System.out.println("Studentului are restante "+areRestante);




// defineste o masina, marca masina, variabile globale, float, inturi @ test system out


    }


}
