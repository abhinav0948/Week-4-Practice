import java.util.*;

public class Find {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String");
        String name = s.nextLine();
        int uc = 0, lc = 0, digit = 0, sc = 0, space = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                uc++;
            } else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
                lc++;
            } else if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
                digit++;
            } else if (name.charAt(i) == ' ') {
                space++;
            } else {
                sc++;
            }
        }
        System.out.println("Alphabets  are : " + (uc + lc));
        System.out.println("digit are : " + digit);
        System.out.println("special characters are : " + sc);
        System.out.println("spaces are  : " + space);
    }
}
