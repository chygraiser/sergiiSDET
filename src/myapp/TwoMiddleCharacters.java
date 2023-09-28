package myapp;

public class TwoMiddleCharacters {
    public static void main(String[] args) {
        String word = "Programing";
        int length = word.length();

        if (length % 2 == 0) {
            System.out.println(word.charAt((length/2)-1) + word.charAt(length/2));
        }
    }
}
