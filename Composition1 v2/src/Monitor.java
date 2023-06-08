public class Monitor {
    private String model;
    private String fabricant;
    private int marime;
    private Rezolutie nativeResolution;

    public Monitor(String model, String fabricant, int marime, Rezolutie nativeResolution) {
        this.model = model;
        this.fabricant = fabricant;
        this.marime = marime;
        this.nativeResolution = nativeResolution;
    }

    public void deseneazaPixelLa(int x, int y, String color){
        System.out.println("desenez pixel la " +x+","+y+ " cu culoarea " +color);
    }
}
