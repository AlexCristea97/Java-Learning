public class PC {
    private Carcasa carcasa;
    private Monitor monitor;
    private PlacaDeBaza placadebaza;

    public PC(Carcasa carcasa, Monitor monitor, PlacaDeBaza placadebaza) {
        this.carcasa = carcasa;
        this.monitor = monitor;
        this.placadebaza = placadebaza;
    }

    private Carcasa getCarcasa() {
        return carcasa;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private PlacaDeBaza getPlacadebaza() {
        return placadebaza;
    }
}
