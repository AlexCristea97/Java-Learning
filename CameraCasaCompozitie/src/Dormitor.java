public class Dormitor {
    private String nume;
    private Perete perete1;
    private Perete perete2;
    private Perete perete3;
    private Perete perete4;
    private Tavan tavan;
    private Pat pat;
    private Lampa lampa;

    public Dormitor(String nume, Perete perete1, Perete perete2, Perete perete3, Perete perete4, Tavan tavan, Pat pat, Lampa lampa) {
        this.nume = nume;
        this.perete1 = perete1;
        this.perete2 = perete2;
        this.perete3 = perete3;
        this.perete4 = perete4;
        this.tavan = tavan;
        this.pat = pat;
        this.lampa = lampa;
    }

    public Lampa getLampa(){
        return this.lampa;
    }

    public void faPatul(){
        System.out.println("Dormitor -> fac patul");
        pat.fa();
    }
}
