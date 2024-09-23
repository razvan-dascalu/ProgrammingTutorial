package oop.mostenire;

public class Student extends Persoana {

    private String facultate;
    private String domeniul;
    private int an;
    private boolean bursa;
    private boolean restante;


    public Student(String prenume, String nume, int varsta, String sex, String adresa, String facultate, String domeniul, int an, boolean bursa, boolean restante) {
        super(prenume, nume, varsta, sex, adresa);
        this.facultate = facultate;
        this.domeniul = domeniul;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;

    }

    public void infoStudent() {
        System.out.println("Facultatea la care studiaza este : " + facultate);
        System.out.println("Domeniul pe care il studiaza este : " + domeniul);
        System.out.println("Are restante : " + restante);
        System.out.println("Este bursier? " + bursa);
        System.out.println("In ce an este studentul? : " + an);

    }
    public void mananca (){
        System.out.println("Studentul mananca in pauza sau dupa cursuri.");

    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getDomeniul() {
        return domeniul;
    }

    public void setDomeniul(String domeniul) {
        this.domeniul = domeniul;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isBursa() {
        return bursa;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public boolean isRestante() {
        return restante;
    }

    public void setRestante(boolean restante) {
        this.restante = restante;
    }
}

