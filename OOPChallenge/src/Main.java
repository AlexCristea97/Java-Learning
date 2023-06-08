public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic","sausage",3.56,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.15);
        System.out.println("the burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon",5.76);
        healthyBurger.addHamburgerAddition1("egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition1("should not do this",110);
        db.itemizeHamburger();
    }
}