package myapp;

public class TwoMiddleCharacters {
    public static void main(String[] args) {
        String word = "Programing";
        int left;
        int right;
        if (word.length() % 2 == 0)
        {
            left = word.length() / 2 - 1;
            right = 2;
        }
        else
        {
            left = word.length() / 2;
            right = 1;
        }
        System.out.print("Two middle characters in the word Programing are : " + word.substring(left, left + right));
    }
}
