import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
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
        
        System.out.println(varint +i );
        System.out.println(dvardouble + d);
        System.out.println(s + string1);        
        
        scan.close();
    }
}