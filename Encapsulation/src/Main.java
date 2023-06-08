public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Alex";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(("Remaining health = " +player.healthRemaining()));
//
//        damage = 91;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println(("Remaining health = " +player.healthRemaining()));

        EnhancedPlayer player = new EnhancedPlayer("Alex", 200, "Sword");
        System.out.println("Intial health is : " + player.getHealth());
    }
}