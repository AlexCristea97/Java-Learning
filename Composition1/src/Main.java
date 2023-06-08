public class Main {

    public static void main(String[] args){
        Dimensiuni dimensiuni = new Dimensiuni(50,50,15);
        Carcasa carcasa = new Carcasa("220B", "Dell","240", dimensiuni);

        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Rezolutie(2540,1440));

        PlacaDeBaza placaDeBaza = new PlacaDeBaza("AB-12","MSI",4,5,"V2.5");

        PC pc = new PC(carcasa,monitor,placaDeBaza);
        pc.getMonitor().deseneazaPixelLa(1520,1200,"rosu");
        pc.getPlacadebaza().incarcaProgram("Windows 97");
        pc.getCarcasa().apasaButonPornire();
    }
}
