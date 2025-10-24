import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");

        String s = scanner.nextLine();
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("The Given String \"" + s + "\" is a palindrome.");
        } else {
            System.out.println("The Given String \"" + s + "\" is not a palindrome.");
        }
    }
}
