import java.io.*;
import java.util.*;

public class q5a {

	int insert_ele(int[] ar,int ele,int size) {
		int i;
		for(i=0;i<size;i++) {
			if(ar[i] == ele)
				return size;
		}
		ar[size] = ele;
		return size + 1;
	}

	int search_ele(int needle,int[] haystack,int size){
		int i;
		for(i = 0;i < size;i++){
			if(needle == haystack[i])
				return needle;
		}
		return -1;
	}
	void Union(int[] A,int sizeA,int[] B,int sizeB) {
		int[] Union_ar = new int[sizeA+sizeB];
		int i,j,k=0;
		for(i = 0; i < sizeA; i++) {
			Union_ar[k] = A[i];
			k++;
		}
		
		for(i = 0; i < sizeB; i++) {	
			if(search_ele(B[i],A,sizeA) ==-1) {
				Union_ar[k] = B[i];
				k++;
			}
		}
		System.out.print("Union is ");
		
		if(k == 0)
			System.out.println("Empty set");
		else {
			for(i=0;i<k;i++)
				System.out.print(Union_ar[i]+" ");
			System.out.println();
		}
	}
	
	void Intersection(int[] A,int sizeA,int[] B,int sizeB) {
		int[] Intersect = new int[sizeA+sizeB];
		int i,j,k=0;
	
		for(i = 0; i < sizeA; i++) {	
			if(search_ele(A[i],B,sizeB) !=-1){
				Intersect[k] = A[i];
				k++;
			}
		}
		System.out.print("Intersection is ");
		
		if(k == 0)
			System.out.println("Empty set");
		
		else {
			for(i=0;i<k;i++)
				System.out.print(Intersect[i]+" ");	
			System.out.println();
		}
	}

	void Complement(int[] ar,int size,int[] Universe,int sizeU) {
		int i,j,k=0;
		int[] ar_comp = new int[sizeU-size];
		
		for(i = 0; i < sizeU; i++) {		
			if(search_ele(Universe[i],ar,size) ==-1){
				ar_comp[k] = Universe[i];
				k++;
			}
		}
		if(k == 0)
			System.out.println("Empty set");
		
		else {
			for(i=0;i<k;i++)
				System.out.print(ar_comp[i]+" ");	
			System.out.println();
		}
	}

	public static void main(String args[]) {
	Set_class ob = new Set_class();
	int[] Universe_ar = new int[11];
	int i;
	for(i = 0 ;i < 11; i++)
		Universe_ar[i] = i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements for set A.enter -1 to stop accepting elements for A");
	int[] B = new int[11];
	int[] A = new int[11];
	for(i = 0 ;i < 11; i++) {
		A[i] = -1;
		B[i] = -1;
	}
	int x = 0,s1 = 0,s2 = 0;
	while(x!=-1) {
		x = sc.nextInt();

		if(x >= 0 && x <= 10)
			s1 = ob.insert_ele(A,x,s1);
		else
			System.out.println("Element not in universe.Enter again");		
		}
	x = 0;
	System.out.println("Enter elements for set B. Enter -1 to stop accepting elements for B");
	
	while(x!=-1) {
		x = sc.nextInt();
		if(x >= 0 && x <= 10)
			s2 = ob.insert_ele(B,x,s2);
		else
			System.out.println("Element not in universe.Enter again");		
		}

	ob.Union(A,s1,B,s2);
	ob.Intersection(A,s1,B,s2);
	
	System.out.print("Complement of set A is ");	
	ob.Complement(A,s1,Universe_ar,11);

	System.out.print("Complement of set B is ");
	ob.Complement(B,s2,Universe_ar,11);
	}
}
