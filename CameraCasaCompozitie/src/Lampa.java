public class Lampa {
    private String stil;
    private boolean baterie;
    private int putereLumina;

    public Lampa(String stil, boolean baterie, int putereLumina) {
        this.stil = stil;
        this.baterie = baterie;
        this.putereLumina = putereLumina;
    }

    public void porneste(){
        System.out.println("Lampa -> porneste");
    }

    public String getStil() {
        return stil;
    }

    public boolean isBaterie() {
        return baterie;
    }

    public int getPutereLumina() {
        return putereLumina;
    }
}
