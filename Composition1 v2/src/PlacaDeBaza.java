public class PlacaDeBaza {
    private String model;
    private String fabricant;
    private int sloturiRAM;
    private int sloturiPlaci;
    private String bios;

    public PlacaDeBaza(String model, String fabricant, int sloturiRAM, int sloturiPlaci, String bios) {
        this.model = model;
        this.fabricant = fabricant;
        this.sloturiRAM = sloturiRAM;
        this.sloturiPlaci = sloturiPlaci;
        this.bios = bios;
    }

    public void incarcaProgram(String numeProgram){
        System.out.println("programul " +numeProgram+ " se incarca");
    }

    public String getModel() {
        return model;
    }

    public String getFabricant() {
        return fabricant;
    }

    public int getSloturiRAM() {
        return sloturiRAM;
    }

    public int getSloturiPlaci() {
        return sloturiPlaci;
    }

    public String getBios() {
        return bios;
    }
}
