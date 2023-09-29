package myapp;

public class TwoMiddleCharacters {
    public static void main(String[] args) {
        String word = "Programing";
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
