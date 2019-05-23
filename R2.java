package Solutions;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int r1 = Integer.parseInt(scan.next());
		int s = Integer.parseInt(scan.next());
		
		//s = (r1 + r2)/2
		//2*s = r1 + r2
		//r2 = 2*s - r1;
		System.out.println(s*2 -r1);

	}

}
