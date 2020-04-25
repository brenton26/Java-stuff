package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        byte b = 1;
//        short s = 1_000;
//        int i = 1_000_000;
//        long l = 50_000 + 10 * (b + s + i);
//        System.out.println(l);

//        Scanner in = new Scanner(System.in);
//        System.out.print("How many poundz?: ");
//        double poundz = in.nextDouble();
//        double kiloz = 0.45359237d * poundz;
//        System.out.println("That is " + kiloz + " kilograms");

//        char c = '\u03a9';
//        System.out.println(c);
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Give num: ");
//        double num1 = in.nextDouble();
//        System.out.print("Give more num: ");
//        double num2 = in.nextDouble();
//        double num3 = (num1 + num2) + 100d;
//        double num4 = num3 % 40;
//        boolean isZero = num4 == 0 ? true : false;
//        System.out.println(isZero);
//        if (!isZero){
//            System.out.println("Got some remainder!");
//        }


        boolean gameOver = true;
        int score = 42;
        int levelCompleted = 7;
        int bonus = 10;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        score = 420;
        levelCompleted = 69;
        bonus = 50;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);


        displayHighScorePosition("Billy", calculateHighScorePosition(420));
        displayHighScorePosition("Ed", calculateHighScorePosition(320));
        displayHighScorePosition("Fred", calculateHighScorePosition(220));
        displayHighScorePosition("George", calculateHighScorePosition(20));


    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 50;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Congrats " + name + ", you got into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 400) return 1;
        else if (score >= 300) return 2;
        else if (score >= 200) return 3;
        else return 4;

    }
}
