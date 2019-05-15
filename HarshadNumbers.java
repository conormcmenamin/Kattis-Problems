package Solutions;

import java.util.Scanner;

public class HarshadNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		
		int counter = n;
		while(n!=0) {
			sum+= n%10;
			n/=10;
		}
		
		int num = 0;
		
		while(counter%sum != 0)
		{
			counter++;
			sum = 0;
			num = counter;
			while(num !=0) {
				sum+= num%10;
				num /=10;
			}
		}
		System.out.println(counter);
		
		
	}

}
