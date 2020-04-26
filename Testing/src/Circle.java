import java.util.Scanner;

public class Circle {
    float r = 10;
    static float pi = 3.14159F;
    float GetArea()  { return ComputeArea(r); }
    static float ComputeArea (float a) {
        count++;
        return pi * a * a;
    }
    static int count = 0;
}

class Cases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a damn char!: ");
        char input = in.next().toUpperCase().charAt(0);
        switch (input) {
            case 'A':
                System.out.print("Wow! you typed A!");
                break;
            case 'B':
                System.out.print("Wow! you typed B!");
                break;
            case 'C':
                System.out.print("Wow! you typed C!");
                break;
            case 'D':
                System.out.print("Wow! you typed D!");
                break;
            default:
                System.out.print("Wow! you typed Something!");
                break;
        }

    }
}