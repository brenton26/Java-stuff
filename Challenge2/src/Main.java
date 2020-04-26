import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");

        int input = in.nextInt();
        System.out.println(sumDigits(input));

    }
    // Process num and return sum of all digits
    // return -1 for invalid value
    // don't process 0-9 only 1 digit so invalid
    static int sumDigits(int num) {
        if (num < 10 && num > -10 ) { return -1; }

        if (num <= -10) { num *= -1; }

        int total = 0;
        while (num > 0) {
            int digit = num % 10;
            total += digit;
            num /= 10;
        }
        return total;
    }
}
