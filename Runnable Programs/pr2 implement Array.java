import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        int n, pos, x;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements you want in the array: ");
        n = s.nextInt();

        int[] a = new int[n + 1];  // extra space for insertion

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        // INSERTION
        System.out.print("Enter the position where you want to insert the element: ");
        pos = s.nextInt();

        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position for insertion!");
        } else {
            System.out.print("Enter the element you want to insert: ");
            x = s.nextInt();

            for (int i = n; i >= pos; i--) {
                a[i] = a[i - 1];
            }

            a[pos - 1] = x;
            n++;  // update size

            System.out.print("After insertion: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        // DELETION
        System.out.print("Enter the position of the element you want to delete: ");
        pos = s.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Invalid position for deletion!");
        } else {
            for (int i = pos - 1; i < n - 1; i++) {
                a[i] = a[i + 1];
            }

            n--;  // decrease size

            System.out.print("After deletion: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
