public class Cont {
    private String numarCont;
    private double fonduri;
    private String numeClient;
    private String emailClient;
    private String telefonClient;

    public Cont(){
        this("5679", 3, "nume implicit", "email implicit", "telefon implicit");
        System.out.println("Constructor gol apelat");
    }

    public Cont(String numarCont, double fonduri, String numeClient, String emailClient, String telefonClient){
        System.out.println("Constructor de cont cu parametrii apelat");
        setNumarCont(numarCont);
        this.numarCont = numarCont;
        this.fonduri = fonduri;
        this.numeClient = numeClient;
        this.emailClient = emailClient;
        this.telefonClient = telefonClient;
    }

    public Cont(String numeClient, String emailClient, String telefonClient) {
        this("99999", 100.30, numeClient, emailClient, telefonClient);
    }

    public void adaugare(double sumaAdaugata){
        this.fonduri += sumaAdaugata;
    }

    public void retragere(double sumaRetrasa){
        if(this.fonduri - sumaRetrasa < 0){
            System.out.println("Fonduri insuficiente. Fonduri disponibile : " + this.fonduri);
        } else {
            this.fonduri -= sumaRetrasa;
            System.out.println("Suma de " + sumaRetrasa + " a fost retrasa din cont. Fonduri ramase : " + this.fonduri);
        }
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public double getFonduri() {
        return fonduri;
    }

    public void setFonduri(double fonduri) {
        this.fonduri = fonduri;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getTelefonClient() {
        return telefonClient;
    }

    public void setTelefonClient(String telefonClient) {
        this.telefonClient = telefonClient;
    }
}
