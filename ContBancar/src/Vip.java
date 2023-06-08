public class Vip {
    private String nume;
    private double limitaCredit;
    private String adresaEmail;

    public Vip() {
        this("nume implicit", 50000.00, "default@default.com");
    }

    public Vip(String nume, double limitaCredit) {
        this(nume, limitaCredit, "janedoe@mail.com");
    }

    public Vip(String nume, double limitaCredit, String adresaEmail) {
        this.nume = nume;
        this.limitaCredit = limitaCredit;
        this.adresaEmail = adresaEmail;
    }

    public String getNume() {
        return nume;
    }

    public double getLimitaCredit() {
        return limitaCredit;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }
}
