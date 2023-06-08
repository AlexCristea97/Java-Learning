public class Caine extends Animal {

    private int ochi;
    private int picioare;
    private int coada;
    private int dinti;
    private String blana;

    public Caine(String nume, int marime, int greutate, int ochi, int picioare, int coada, int dinti, String blana) {
        super(nume, 1, 1, marime, greutate);
        this.ochi = ochi;
        this.picioare = picioare;
        this.coada = coada;
        this.dinti = dinti;
        this.blana = blana;
    }

    private void mesteca(){
        System.out.println("caine.mesteca() apelat");
    }

    @Override
    public void mananca() {
        System.out.println("caine.mananca() apelat");
        mesteca();
        super.mananca();
    }

    public void merge(){
        System.out.println("dog.merge() apelat");
        super.misca(5);
    }

    private void miscaPicioare(int viteza){
        System.out.println("caine.miscaPicioare() apelat");
    }

    @Override
    public void misca(int viteza) {
        System.out.println("caine.misca() apelat");
        miscaPicioare(viteza);
        super.misca(viteza);
    }

    public void alearga(){
        System.out.println("caine.alearga() apelat");
        misca(10);
    }
}
