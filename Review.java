import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Review {

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int j=0;j<t;j++)
        {
    String in = sc.next();

    for( int i=0;i<in.length() ;i=i+2)
        {  System.out.print(in.charAt(i));
        }
        System.out.print(" ");
        for(int i=1;i<in.length();i=i+2)
            {
                 System.out.print(in.charAt(i));
            }
        System.out.println();
        }

}
}

