import java.io.*;
import java.util.*;

public class q3 {

	public int min(int a,int b) {
		return a>b?b:a;
	}

	public int compare(String ar1,String ar2) {
		int n = min(ar1.length(),ar2.length());	
		int i;
		char t1,t2;
		
		for(i = 0 ; i < n ; i++) {
			t1 = ar1.charAt(i);
			t2 = ar2.charAt(i);

			if(t1 != t2) {
				if(t1 < t2)
					return 1;
				else
					return 2;
			}
		}

		if(ar1.length() == ar2.length())
			return 0;

		else if(ar1.length() > ar2.length())
		
			return 2;
		
		else
			return 1;

	}
	public void merge(String[] str_list,int start,int mid,int end) {
		String[] t1 = new String[mid - start + 1];
		String[] t2 = new String[end - mid];
		
		int l1,l2;
		int i = start;
		for(l1 = 0; l1 <= mid - start ; l1++,i++)
			t1[l1] = str_list[i];
		for(l2 = 0; l2 <= end - mid - 1 ; l2++,i++)
			t2[l2] = str_list[i];
		i = start;
		int test;
		for(l1 = 0,l2 = 0 ; l1 <= mid - start && l2 <= end - mid - 1 ; i++) {
			test = compare(t1[l1],t2[l2]);
			if(test == 1) {	
				str_list[i] = t1[l1];
				l1++; 
			}
			else if(test == 2) {
				str_list[i] = t2[l2];
				l2++;
			}
			else {
				str_list[i] = t2[l2];
				l2++;
				i++;
				str_list[i] = t1[l1];
				l1++;
			}
		}
		for(; l1 <= mid - start; l1++,i++)
			str_list[i] = t1[l1];
		for(; l2 <= end - mid - 1 ; l2++,i++)
			str_list[i] = t2[l2];
	}

	public void mergesort(String[] str_list,int start,int end) {
		if(start >= end)
			return;
		int mid = start + end;
		mid = mid / 2;
		mergesort(str_list,start,mid);
		mergesort(str_list,mid + 1,end);
		merge(str_list,start,mid,end);
	}

	public static void main(String args[]) throws IOException {

		str_sort ob = new str_sort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		
		int len = sc.nextInt();
		sc.nextLine();
		String[] ele_ar = new String[len];
		System.out.println();
		int i = 0;
		while(i < len){
			ele_ar[i] = sc.nextLine();
			i++;
		}
		ob.mergesort(ele_ar,0,len - 1);
		for(i = 0; i < len;i++)
			System.out.println(ele_ar[i]);

	}
}
