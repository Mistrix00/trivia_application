package net.mistrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String question1 = "Hoeveel provincies heeft Nederland?";
        String question2 = "Wat is de hoofdstad van Turkije";
        String question3 = "Waar wordt kaas van gemaakt?";

        int answer1 = 12;
        String answer2 = "Ankara";
        String answer3 = "Melk";

        int points = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(question1);
        int userInput1 = scanner.nextInt();

        if(userInput1 == answer1) {
            points++;
            System.out.println("Your answer was correct! You have " + points + " points.");
        } else {
            System.out.println("Incorrect! The correct answer is: " + answer1);
        }

        System.out.println("");
        System.out.println(question2);
        String userInput2 = scanner.next();

        if(userInput2.equals(answer2)) {
            points++;
            System.out.println("Your answer was correct! You have " + points + " points.");
        } else {
            System.out.println("Incorrect! The correct answer is: " + answer2);
        }

        System.out.println("");
        System.out.println(question3);
        String userInput3 = scanner.next();

        if(userInput3.equals(answer3)) {
            points++;
            System.out.println("Your answer was correct! You have " + points + " points.");
        } else {
            System.out.println("Incorrect! The correct answer is: " + answer3);
        }

        if(points == 3) {
            System.out.println("You are a genius! Everything correct!");
        } else if (points == 2) {
            System.out.println("You are pretty smart. Only one mistake!");
        } else if (points == 1) {
            System.out.println("You are okay. Made two mistakes. It can happen to anyone!");
        } else if (points == 0) {
            System.out.println("You... you got everything wrong!");
        } else if (points < 0) {
            System.out.println("HOW DID YOU EVEN GET NEGATIVE POINTS?!");
        }
    }
}