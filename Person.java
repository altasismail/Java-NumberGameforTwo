package games.numbers;

import java.util.Random;
import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);

    {
        System.out.println("We have a 3 digit number, let's see if you can guess it?  ");
        System.out.println("Here enter your guess : ");
    }




    int guess_int1 = scanner.nextInt();
    int randomNumber = number.rand_int1;
    int difference;
    int findDifference(){
        if (randomNumber>guess_int1){
            difference = randomNumber-guess_int1;
        }
        if(guess_int1>randomNumber){
            difference = guess_int1-randomNumber;
        }
        return difference;
    }


}