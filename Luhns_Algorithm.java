package Solutions;

import java.util.Scanner;

public class Luhns_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int counter = 1;
		while(counter<=n) {
			String s = scan.next();
			if(luhns(s)) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL");
			}
			counter++;
		}
	}
	static boolean luhns(String s) {
		boolean second = false;
		int sum = 0;
		for(int i = s.length()-1;i>=0;i--)
		{
			int n = Integer.parseInt("" + s.charAt(i));
			if(second) {
				n *=2;
				if(n>9) {
					n -= 9;
				}
			
			}
			sum+=n;
			second = !second;
		}
		return sum%10==0;
	}

}
