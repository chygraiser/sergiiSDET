package myapp;

import java.util.Scanner;
public class TwoMiddleCharactersScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the word with even characters: ");
        String word = scan.nextLine();

        int leftside;
        int rightside;
        if (word.length() % 2 == 0) {
            leftside = word.length() / 2 - 1;
            rightside = 2;
        } else {
            leftside = word.length() / 2;
            rightside = 1;
        }
        System.out.print("Two middle characters in the word Programing are : " + word.substring(leftside, leftside + rightside));
    }
}