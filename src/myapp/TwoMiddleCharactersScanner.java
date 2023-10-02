package myapp;

import java.util.Scanner;
public class TwoMiddleCharactersScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the word with even characters: ");
        String word = scan.nextLine();

        int leftSide;
        int rightSide;
        if (word.length() % 2 == 0) {
            leftSide = word.length() / 2 - 1;
            rightSide = 2;
        } else {
            leftSide = word.length() / 2;
            rightSide = 1;
        }
        System.out.print("Two middle characters in the entered word are : " + word.substring(leftSide, leftSide + rightSide));
    }
}