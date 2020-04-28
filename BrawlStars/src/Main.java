public class Main {

    public static void main(String[] args){

        Weapon weapon1 = new Weapon("Poison Dart", 10, 5);
        Weapon weapon2 = new Weapon("Bat", 50, 1);

        Brawler player1 = new Brawler("Crow", 100, weapon1);
        Brawler player2 = new Brawler("Bibi", 150, weapon2);


        System.out.println("\nFight!\n");
        Battle battle = new Battle(player1, player2);


    }
}
