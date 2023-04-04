import java.util.*;

public class Find2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a string : ");
        String name = s.nextLine();

        System.out.println("Upper case alphabets are ");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                System.out.println(name.charAt(i));
            }
        }
        System.out.println("Lower case alphabets are ");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
                System.out.println(name.charAt(i));
            }

        }
    }
}
