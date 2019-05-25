package Solutions;

import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		int rollover = x;
		int sum = x;
		for(int i = 1; i<=n; i++) {
			rollover+=x;
			int j = scan.nextInt();
			rollover = (rollover)-j;
			
		}
		System.out.println(rollover);
	}

}
