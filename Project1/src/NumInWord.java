import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Type a year to see if it's a leap year: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.print(isLeapYear(input));

    }

    static boolean isLeapYear(int year){
        System.out.println(year);
        System.out.println(year%4);
        if (year < 1 || year > 9999) return false;
        if (year%4 == 0) return true;
        else return false;
    }

}


