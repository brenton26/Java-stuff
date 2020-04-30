import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


//        Weapon weapon1 = new Weapon("Poison Dart", 10, 5);
//        Weapon weapon2 = new Weapon("Bat", 50, 1);
//
//        Brawler player1 = new Brawler("Crow", 100, weapon1);
//        Brawler player2 = new Brawler("Bibi", 150, weapon2);
//
//        System.out.println("\nFight!\n");
//        Battle battle = new Battle(player1, player2);

        locations.put(0, new Location(0, "You are...1"));
        locations.put(1, new Location(0, "You are...1"));
        locations.put(2, new Location(0, "You are...3"));
        locations.put(3, new Location(0, "You are...3"));
        locations.put(4, new Location(0, "You are...4"));
        locations.put(5, new Location(0, "You are...5"));
        locations.put(6, new Location(0, "You are...6"));

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc==0) break;
        }
        loc = in.nextInt();
        if(!locations.containsKey(loc)) System.out.println("Can't go in that direction");


    }
}
