package myapp;

public class TwoMiddleCharacters {
    public static void main(String[] args) {
        String word = "Programing";
        int leftSide;
        int rightSide;
        if (word.length() % 2 == 0) {
            leftSide = word.length() / 2 - 1;
            rightSide = 2;
        } else {
            leftSide = word.length() / 2;
            rightSide = 1;
        }
        System.out.print("Two middle characters in the word Programing are : " + word.substring(leftSide, leftSide + rightSide));
    }
}
