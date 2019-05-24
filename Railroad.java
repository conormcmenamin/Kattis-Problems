package Solutions;

import java.util.Scanner;

public class Railroad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(), y= scan.nextInt();
		int sum = x*4 + y*3;
		if(sum%2 == 0) {
			System.out.println("possible");
		}else {
			System.out.println("impossible");
		}
	}

}
