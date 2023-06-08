public class Animal {

    private String nume;
    private int creier;
    private int corp;
    private int marime;
    private int greutate;

    public Animal(String nume, int creier, int corp, int marime, int greutate) {
        this.nume = nume;
        this.creier = creier;
        this.corp = corp;
        this.marime = marime;
        this.greutate = greutate;
    }

    public void mananca(){
        System.out.println("Animal.mananca apelat");
    }

    public void misca(int viteza){
        System.out.println("animal.misca() apelat. Animalul se misca cu viteza de " +viteza);
    }

    public String getNume() {
        return nume;
    }

    public int getCreier() {
        return creier;
    }

    public int getCorp() {
        return corp;
    }

    public int getMarime() {
        return marime;
    }

    public int getGreutate() {
        return greutate;
    }
}
