package oop.mostenire;

public class Angajat extends Persoana {

    private String firma;
    private String pozitia;
    private int salariu;
    private String experienta;

    public Angajat(String prenume, String nume, int varsta, String sex, String adresa, String firma, String pozitia, int salariu, String experienta) {
        super(prenume, nume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitia = pozitia;
        this.salariu = salariu;
        this.experienta = experienta;

    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este : " +firma);
        System.out.println("Pozitia angajatului in firma este : " + pozitia);
        System.out.println("Salariul angajatului este : " + salariu);
        System.out.println("Experienta angajatului este : " + experienta);

    }

    public void mananca(){
        super.mananca();
        System.out.println("Angajatul mananca cand are pauza.");

    }

    //polimorfismul static

    public void marire(){
        System.out.println("Angajatul primeste marirea anuala standard.");
    }

    public void marire(int procent) {
        System.out.println("Angajatul primeste marirea anuala de " + procent + "%");
    }
    public void marire(String grad) {
        System.out.println("Angajatul primeste gradul " + grad);
    }
    public void marire(int procent, String grad) {
        System.out.println("Angajatul primeste gradul " + grad + " si procentul de" + procent);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getPozitia() {
        return pozitia;
    }

    public void setPozitia(String pozitia) {
        this.pozitia = pozitia;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;

    }
}



