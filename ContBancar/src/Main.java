public class Main {
    public static void main(String[] args){
        Cont contAlex = new Cont();
        contAlex.setNumarCont("1234567890");
        contAlex.setFonduri(0.00);
        contAlex.setNumeClient("Alex Banking");
        contAlex.setEmailClient("alexbanking000@gmail.com");
        contAlex.setTelefonClient("0721314569");

        contAlex.retragere(100.0);

        contAlex.adaugare(50);
        contAlex.retragere(100);

        contAlex.adaugare(51);
        contAlex.retragere(100);

        Cont contCosmin = new Cont();//"1234567", 0.00, "Cosmin Banking", "cosminbanking000@gmail.com", "0789456123");
        System.out.println(contCosmin.getNumarCont());
        System.out.println(contCosmin.getFonduri());
        contCosmin.retragere(100.0);

        contCosmin.adaugare(50);
        contCosmin.retragere(100);

        contCosmin.adaugare(51);
        contCosmin.retragere(100);

        Cont contAna = new Cont("Ana", "ana@ana.com", "058756622");
        System.out.println(contAna.getNumarCont()+ " nume "+ contAna.getNumeClient());
        System.out.println("Fonduri curente: "+ contAna.getFonduri());
        contAna.retragere(10);

        Vip client1= new Vip();
        System.out.println(client1.getNume());

        Vip client2= new Vip("Maria", 2500.00);
        System.out.println(client2.getNume());

        Vip client3 = new Vip("Andreea", 125.00,"andreea@mail.com");
        System.out.println(client3.getNume());
        System.out.println(client3.getAdresaEmail());
    }
}
