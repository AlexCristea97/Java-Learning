public class Masina extends Vehicul {
    private int usi;
    private int capacitateMotor;

    public Masina(String nume, int usi, int capacitateMotor) {
        super(nume);
        this.usi = usi;
        this.capacitateMotor = capacitateMotor;
    }
}
