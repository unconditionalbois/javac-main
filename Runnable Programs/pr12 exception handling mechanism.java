import java.util.*;
public class pr12 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
try {
int num = scanner.nextInt();
int result = 10 / num;
System.out.println(&quot;Result = &quot; + result);
} catch (ArithmeticException e) {
System.out.println(&quot;Error: &quot; + e.getMessage());
} catch (Exception e) {
System.out.println(&quot;Unknown error occurred: &quot; + e.getMessage());
} finally {
System.out.println(&quot;Program execution completed.&quot;);
}
}
}
