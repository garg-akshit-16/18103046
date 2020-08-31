import java.io.*;
import java.util.*;

public class q6 {

	public static void main(String args[]) throws IOException {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num != 1) {
			
			if(num%2 == 0)
				num = num/2;
			else
				num = 3*num + 1;

			System.out.println(num);

		}
	}
}
