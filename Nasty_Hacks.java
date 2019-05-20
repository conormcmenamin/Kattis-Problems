package Solutions;

import java.util.Scanner;

public class Nasty_Hacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), r= 0, e =0, c=0;
		
		int counter = 1;
		while(counter<=n) {
			
			r = scan.nextInt();
			e = scan.nextInt();
			c = scan.nextInt();
			if((e-c) >r) {
				System.out.println("advertise");
			}else if((e-c) == r) {
				System.out.println("does not matter");
			}else {
				System.out.println("do not advertise");
			}
				
			
			counter++;
		}
	}

}
