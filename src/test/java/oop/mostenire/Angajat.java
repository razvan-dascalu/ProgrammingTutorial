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



