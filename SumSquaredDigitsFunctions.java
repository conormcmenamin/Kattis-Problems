package Solutions;

import java.util.Scanner;

public class SumSquaredDigitsFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int counter = 1;
		int ar[] = new int[k];
		while(counter <= k) {
			int useless = scan.nextInt();
			int base = scan.nextInt();
			int num = scan.nextInt();
			int sum = 0;
			while(num !=0) {
				sum += Math.pow(num%base,2);
				num/=base;
			}
			ar[counter-1] = sum;
			counter++;
		}
		for(int i = 0; i<k;i++) {
			System.out.println((i+1) + " " + ar[i]);
		}
		
	}

}
