package grayson.projects;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Grayson", 50, "Katana");
        System.out.println("Initial health is " + player.getHealth());


// BAD PRACTICE!!

//        Player player = new Player();
//        player.name = "Frodo";
//        player.health = 20;
//        player.weapon = "Battle Axe";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

    }
}
