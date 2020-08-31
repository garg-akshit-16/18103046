import java.io.*;
import java.util.*;

public class q1 {
	
	public int min(int a,int b) {
		return (a>b)?b:a;
	}

	public void compare(String ar1,String ar2) {
		int n = min(ar1.length(),ar2.length());	
		int i;
		char t1,t2;
		
		for(i = 0 ; i < n ; i++) {
			char1 = ar1.charAt(i);
			char2 = ar2.charAt(i);

			if(t1 != t2) {
				if(char1 < char2)
					System.out.println(ar1 + " comes before " + ar2);
				else
					System.out.println(ar2 + " comes before " + ar1);
				return;
			}
		}

		if(ar1.length() == ar2.length())
			System.out.println("Both strings are lexicographically same");

		else if(ar1.length() > ar2.length())
		
			System.out.println(ar2 + " comes lexicographically before " + ar1);
		
		else
			System.out.println(ar1 + " comes lexicographically before " + ar2);

	}
	public static void main(String args[]) {
		str_comp ob = new str_comp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word");
		String s1 = sc.nextLine();
		System.out.println("Enter second word"); 
		String s2 = sc.nextLine();
		
		ob.compare(s1,s2);
	}
}
