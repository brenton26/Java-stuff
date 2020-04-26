import java.util.Scanner;
public class Pack {
    public static void main(String[] args) {
        canPackPrompt();
    }

    private static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal <= 0) return false;
        if (bigCount*5 + smallCount < goal ) return false;
        return goal%5 <= smallCount;
    }

    private static void canPackPrompt(){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Ed's Can It Pack? App!");
        System.out.println("Large bags weigh 5 lbs, small bags weigh 1 lb.");
        System.out.println("Only full bags can be shiped.\n");


        int largeBags;
        do {
            System.out.print("Number of Large bags: ");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number, asshole.");
                System.out.print("Number of Large bags: ");
                in.next();
            }
            largeBags = in.nextInt();
        } while (largeBags <= 0);

        int smallBags;
        do {
            System.out.print("Number of Small bags: ");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number, asshole.");
                System.out.print("Number of small bags: ");
                in.next();
            }
            smallBags = in.nextInt();
        } while (smallBags <= 0);

        int goal;
        do {
            System.out.print("goal weight to ship: ");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number, asshole.");
                System.out.print("goal weight to ship: ");
                in.next();
            }
            goal = in.nextInt();
        } while(goal <= 0);

        System.out.println(canPack(largeBags, smallBags, goal));
    }
}
