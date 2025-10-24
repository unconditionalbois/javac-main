import java.util.*;

class Sorting {
    void sortStrings() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();

        String[] str = new String[n];

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            str[i] = s.next(); // Reads each string
        }

        // Sorting using compareTo()
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Ascending order of the given values:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}

public class pr5 {
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        obj.sortStrings();
    }
}
