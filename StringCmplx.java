import java.util.*;

class StringCmplx {
    public static void main(String args[]) {
        String str = "Hi hello welcome to bitlabs";
        String words[] = str.split(" ");
        System.out.println("Number of words: " + words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " : " + words[i].length());
        }
    }
}
