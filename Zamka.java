package Solutions;

import java.util.Scanner;

public class Zamka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt(), d = scan.nextInt(), x = scan.nextInt();
		
		System.out.println(min(l,d,x));
		System.out.println(max(l,d,x));
	}
	static int min(int l,int d,int x) {
		for(int i = l; i<=d;i++) {
			if(sumdigits(i) == x) {
				return i;
			}
		}
		return 0;
	}
	static int max(int l,int d, int x) {
		for(int i = d; i>=l; i--) {
			if(sumdigits(i) == x) {
				return i;
			}
		}
		return 0;
	}
	static int sumdigits(int n) {
		int sum = 0;
		
		while(n !=0) {
			sum += n%10;
			n/=10;
		}
		return sum;
	}

}
