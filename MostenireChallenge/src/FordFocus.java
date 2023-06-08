public class FordFocus extends Masina{
    private int luniPanaLaService;

    public FordFocus( int service) {
        super("FordFocus", "4WD", 5, 5, 6, false);
        this.luniPanaLaService = luniPanaLaService;
    }

    public void accelereaza(int rataAccelerare){
        int vitezaNoua = getVitezaActuala() + rataAccelerare;
        if(vitezaNoua == 0){
            opreste();
            setTreaptaCurenta(1);
        } else if ( vitezaNoua >0 && vitezaNoua <=20 ) {
            setTreaptaCurenta(1);
        } else if ( vitezaNoua > 20 && vitezaNoua <= 40) {
            setTreaptaCurenta(2);
        } else if (vitezaNoua >40 && vitezaNoua <=60 ) {
            setTreaptaCurenta(3);
        } else {
            setTreaptaCurenta(4);
        }
        if(vitezaNoua > 0){
            schimbaViteza(vitezaNoua,getDirectiaActuala());
        }
    }
}
