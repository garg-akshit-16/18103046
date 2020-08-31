import java.io.*;
import java.util.*;

public class q2
{
	public void count_sort(int[] ar,int len) {
		int[] map_ar = new int[21];
		int i,k;

		for(i = 0;i < len;i++)
			map_ar[ar[i]]++;

		for(k = 0,i = 0;i < len;) {
			if(map_ar[k] > 0) {
				ar[i] = k;
				map_ar[k]--;
				i++;
			}
			else
				k++;
		}
		for(i = 0;i < len;i++)
			System.out.println(ar[i]);

	}
	public static void main(String args[]) {

		count_sort ob = new count_sort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int len = sc.nextInt();
		int[] ele_ar = new int[len];
		int i = 0;
		while(i < len){
			ele_ar[i] = sc.nextInt();
			i++;
		}
		ob.count_sort(ele_ar,len);
	}
}
