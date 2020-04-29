import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args){
        int[] myDamnInts = getInts(5);
        printArray(myDamnInts);
        getMin(myDamnInts);
        getMean(myDamnInts);
        System.out.println("\nReversed:");
        reverse(myDamnInts);
        System.out.println("\nSorted:");
        sorted(myDamnInts);
    }

    // Prints all elements of an array
    static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " +i +" is " +array[i]);
        }
    }

    // Gets array of ints from user input
    static int[] getInts(int num){
        System.out.println("Enter 5 numbers you little fucking pussy ass bitch: ");
        int[] values = new int[num];
        for(int i=0; i<values.length; i++){
            values[i] = in.nextInt();
        }
        return values;
    }

    // Return the average of an array
     static double getMean(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        double mean = sum/(double)array.length;
        System.out.println("\nThe average value is: " +mean);
        return mean;
    }

    // Return min value from an array
    static int getMin(int[] array){
        int minValue = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("\nThe minumum value is: " +minValue);
        return minValue;
    }

    // Return a sorted array
    static int[] sorted(int[] array){
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<array.length-1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        printArray(array);
        return array;
    }

    // Reverses an array
    static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        int index = 0;
        for (int i=array.length-1; i>=0 ; i--){
            reversed[index] = array[i];
            index += 1;
        }
        printArray(reversed);
        return reversed;
    }
}
