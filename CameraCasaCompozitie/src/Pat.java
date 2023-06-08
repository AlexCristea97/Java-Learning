public class Pat {
    private String tip;
    private int perne;
    private int inaltime;
    private int lenjerii;
    private int pilote;

    public Pat(String tip, int perne, int inaltime, int lenjerii, int pilote) {
        this.tip = tip;
        this.perne = perne;
        this.inaltime = inaltime;
        this.lenjerii = lenjerii;
        this.pilote = pilote;
    }

    public void fa(){
        System.out.println("Pat -> fac ");
    }

    public String getTip() {
        return tip;
    }

    public int getPerne() {
        return perne;
    }

    public int getInaltime() {
        return inaltime;
    }

    public int getLenjerii() {
        return lenjerii;
    }

    public int getPilote() {
        return pilote;
    }
}
