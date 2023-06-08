public class Peste extends Animal {
    private int branhii;
    private int ochi;
    private int aripioare;

    public Peste(String nume, int marime, int greutate, int branhii, int ochi, int aripioare) {
        super(nume, 1, 1, marime, greutate);
        this.branhii = branhii;
        this.ochi = ochi;
        this.aripioare = aripioare;
    }

    private void odihnire(){

    }

    private void miscaMuschii(){

    }

    private void miscaAripiaraDinSpate(){


    }

    private void inoata(int viteza){
        miscaMuschii();
        miscaAripiaraDinSpate();
        super.misca(viteza);

    }
}
