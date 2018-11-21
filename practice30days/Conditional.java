import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*; 

public class Conditional {

    private static final Scanner scanner = new Scanner(System.in);

    private static final int LOWER_LIMIT = 6;
    private static final int UPPER_LIMIT = 20;

    private static boolean isWeird(int n) {
        return (n % 2 == 1) || (LOWER_LIMIT <= n && n <= UPPER_LIMIT);
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String result = isWeird(N) ? "Weird" : "Not Weird";
        System.out.println(result);        
    }
}
