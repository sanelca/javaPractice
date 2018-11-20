import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*; 

public class HelloWorld {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * (tip_percent / 100.0);
        double tax = meal_cost * (tax_percent / 100.0);
        double result = meal_cost + tip + tax;
        System.out.println(Math.round(result));
    }   
    private static final Scanner scanner = new Scanner(System.in);     
    public static void main(String[] args) {
/*         Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello Adna!");
        System.out.println(inputString); */

        //Task 2
/*         int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int varint;
        double dvardouble;
        String string1;

        varint = scan.nextInt();
        dvardouble = scan.nextDouble();
        string1 = scan.nextLine();
        string1 = scan.nextLine();
        
        System.out.println(varint+i);
        System.out.println(dvardouble+d);
        System.out.println(s+string1); */

        //Task 3
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();      

    }
}