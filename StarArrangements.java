package Solutions;

import java.util.Scanner;

public class StarArrangements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n + ":");
		
			for(int j = 2; j<n;j++) {
				if(isPossible(j,j-1,n)){
					System.out.println(j + "," + (j-1));
				}
				if(isPossible(j,j,n)) {
					System.out.println(j + "," + j);
				}
			}
		
	}
	static boolean isPossible(int n, int m,int x) {
		boolean b = true;
		if(!((n-m<=1)&& (n-m>=0))) {
			return false;
		}
		
		while(x>0) {
			if(b == true) {
				x -= n;
			}else {
				x -= m;
			}
			b = !b;
		}
		if(x<0) {
			return false;
		}else {
			return true;
		}
	}

}
