package games.numbers;

import java.util.Random;
import java.util.Scanner;

public class number {
    static Random random = new Random();
    static int rand_int1 = random.nextInt(1000);

    public static void main(String[] args) {


        System.out.println("For Player 1 : ");
        Person p1 = new Person();
        System.out.println("For Player 2 : ");
        Person p2 = new Person();
        if (p1.difference > p2.difference) {
            System.out.println("Player 2 has won!");

        }
        if (p1.difference < p2.difference) {
            System.out.println("Player 1 has won!");
        }
        int p1Score = p1.findDifference();
        int p2Score = p2.findDifference();
        System.out.println("The number was : " + rand_int1 + " Player 1 : " + p1Score + " & Player 2 : " + p2Score);
        if (p1Score<p2Score){
            System.out.println("Player 1 Won! You have guessed much closer number");
        }
        if (p1Score>p2Score){
            System.out.println("Player 2 Won! You have guessed much closer number");
        }

    }


}
