public class Vehicul {
    private String nume;
    private String size;

    private int vitezaActuala;
    private int directiaActuala;

    public Vehicul(String nume, String size) {
        this.nume = nume;
        this.size = size;
        this.vitezaActuala = 0;
        this.directiaActuala = 0;
    }

    public void vireaza(int directie){
        this.directiaActuala += directie;
        System.out.println("vehicul.vireaza(): vireaza la " + directiaActuala + " grade.");

    }

    public void misca(int viteza, int directie){
        directiaActuala = directie;
        vitezaActuala = viteza;
        System.out.println("vehicul.move(): se misca cu viteza de " +vitezaActuala + " in directia " + directiaActuala);
    }

    public String getNume() {
        return nume;
    }

    public String getSize() {
        return size;
    }

    public int getVitezaActuala() {
        return vitezaActuala;
    }

    public int getDirectiaActuala() {
        return directiaActuala;
    }

    public void opreste(){
        this.vitezaActuala = 0;
    }
}
