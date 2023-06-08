public class Main {
    public static void main(String[] args){
        Perete perete1 = new Perete("vest");
        Perete perete2 = new Perete("est");
        Perete perete3 = new Perete("sud");
        Perete perete4 = new Perete("nord");

        Tavan tavan = new Tavan(12,"rosu");

        Pat pat = new Pat("Modern", 4,3,2,1);

        Lampa lampa = new Lampa("Clasic", false, 6500);

        Dormitor dormitor = new Dormitor("Tims", perete1, perete2, perete3, perete4, tavan, pat, lampa);
        dormitor.faPatul();

        dormitor.getLampa().porneste();



    }
}
