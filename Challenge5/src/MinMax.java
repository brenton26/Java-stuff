import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("This program will output the min and max values");

        int min, max;
        min = max = 0;
        boolean first = true;

        while(true) {
            System.out.print("Input number: ");
            boolean isInt = in.hasNextInt();

            if (isInt) {
                int input = in.nextInt();

                if (first) {
                    min = max = input;
                    first = false;
                }

                if (input > max) max = input;
                if (input < min) min = input;

            } else {
                break;
            }
        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
