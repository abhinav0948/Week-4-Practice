import java.util.*;

public class MaxString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the string : ");
        String sentence = s.nextLine();
        String[] word = sentence.split(" ");
        String longest = word[0];
        for (int i = 1; i < word.length; i++) {
            if (word[i].length() > longest.length()) {
                longest = word[i];
            }
        }
        System.out.println("longest word: " + longest);
    }
}
