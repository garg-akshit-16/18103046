import java.io.*;
import java.util.*;

public class q5b {

	public static void main(String args[]) {
	Set_class_effi ob = new Set_class_effi();
	Set<Integer> Universe_ar = new HashSet<Integer>();
	int i;
	for(i = 0 ;i < 11; i++)
		Universe_ar.add(i);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements for set A.enter -1 to stop accepting elements for A");
	
	Set<Integer> A = new HashSet<Integer>();
	Set<Integer> B = new HashSet<Integer>();
	
	int x = 0;
	while(x!=-1) {
		x = sc.nextInt();
		if(x >= 0 && x <= 10)
			A.add(x);
		else
			System.out.println("Element not in universe.Enter again");		
		}
	x = 0;
	System.out.println("Enter elements for set B.enter -1 to stop accepting elements for B");
	
	while(x!=-1) {
		x = sc.nextInt();
		if(x >= 0 && x <= 10)
			B.add(x);
		else
			System.out.println("Element not in universe.Enter again");		
		}
	Set<Integer> Union = new HashSet<Integer>(A);
	Set<Integer> Intersection = new HashSet<Integer>(A);
	Set<Integer> Complement_A = new HashSet<Integer>(Universe_ar);
	Set<Integer> Complement_B = new HashSet<Integer>(Universe_ar);
	
	Union.addAll(B);
	Intersection.retainAll(B);
	Complement_A.removeAll(A);
	Complement_B.removeAll(B);
	System.out.println("Union of the sets is " + Union);
	
	System.out.println("Intersection of the sets is " + Intersection);
	
	System.out.println("Complement of the set A is " + Complement_A);
	
	System.out.println("Complement of the set B is " + Complement_B);


	}
}
