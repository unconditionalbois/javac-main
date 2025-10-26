import java.util.*;

public class pr12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        try {
            int num = scanner.nextInt();
            int result = 10 / num; 
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unknown error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
