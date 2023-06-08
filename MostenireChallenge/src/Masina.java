public class Masina extends Vehicul{
    private int roti;
    private int usi;
    private int trepte;
    private boolean eManuala;
    private int treaptaCurenta;

    public Masina(String nume, String size, int roti, int usi, int trepte, boolean eManuala) {
        super(nume, size);
        this.roti = roti;
        this.usi = usi;
        this.trepte = trepte;
        this.eManuala = eManuala;
        this.treaptaCurenta = 1;
    }

    public void setTreaptaCurenta(int treaptaCurenta) {
        this.treaptaCurenta = treaptaCurenta;
        System.out.println("Masina.setTreaptaCurenta(): Schimbat la treapta " + this.treaptaCurenta);
    }

    public void schimbaViteza(int viteza, int directie){
        misca(viteza, directie);
        System.out.println("Maina.schimbaViteza()  : Viteza " + viteza + " directia " + directie);
    }
}
