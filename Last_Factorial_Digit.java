package Solutions;

import java.util.Scanner;

public class Last_Factorial_Digit {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[] = new int[n];
		int product = 1;
		for(int i = 0; i<= n-1; i++) {
			ar[i] = scan.nextInt();
		}
		for(int j = 0; j<= n-1; j++)
		{
			for(int k=1; k<=ar[j]; k++)
			{
				product *= k;
			}
			System.out.println(product%10);
			product = 1;
		}
	}

}
