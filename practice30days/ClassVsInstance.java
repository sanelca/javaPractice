import java.io.*;
import java.util.*;

public class ClassVsInstance {
    private int age;	
  
	public ClassVsInstance(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
            age = initialAge;
	}

	public void amIOld() {
        String out = "";
        if (age < 13)
            out = "You are young.";
        else if (age < 18)
            out = "You are a teenager.";
        else
            out = "You are old.";
        System.out.println(out);
	}

	public void yearPasses() {
  		age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassVsInstance p = new ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}