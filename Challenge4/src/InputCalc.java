import java.util.Scanner;

public class InputCalc {

    public static void main(String[] args){
        inputThenSumAndAverage();
    }


    public static void inputThenSumAndAverage(){

        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int count = 0;
        int sum = 0;
        int average = 0;

        while (!flag) {
            System.out.print("\nEnter a number: ");
            if (in.hasNextInt()) {

                int userInput = in.nextInt();
                count ++;
                sum += userInput;
            } else {
                flag = true;
                average = (sum/count);
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
