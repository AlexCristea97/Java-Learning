public class PC {
    private Carcasa carcasa;
    private Monitor monitor;
    private PlacaDeBaza placadebaza;

    public PC(Carcasa carcasa, Monitor monitor, PlacaDeBaza placadebaza) {
        this.carcasa = carcasa;
        this.monitor = monitor;
        this.placadebaza = placadebaza;
    }
    public void porneste(){
        carcasa.apasaButonPornire();
        afiseazaLogo();
    }

    private void afiseazaLogo(){
        monitor.deseneazaPixelLa(1200,50,"galben");
    }

}
