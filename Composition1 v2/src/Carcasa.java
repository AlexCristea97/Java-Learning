public class Carcasa {
    private String model;
    private String fabricant;
    private String sursa;
    private Dimensiuni dimensiuni;

    public Carcasa(String model, String fabricant, String sursa, Dimensiuni dimensiuni) {
        this.model = model;
        this.fabricant = fabricant;
        this.sursa = sursa;
        this.dimensiuni = dimensiuni;
    }

    public void apasaButonPornire(){
        System.out.println("buton apasat");
    }

    public String getModel() {
        return model;
    }

    public String getFabricant() {
        return fabricant;
    }

    public String getSursa() {
        return sursa;
    }

    public Dimensiuni getDimensiuni() {
        return dimensiuni;
    }
}
