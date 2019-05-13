package Solutions;

import java.util.Scanner;

public class DiceCup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		int possibilities[] = new int[n+m+2];
		
		for(int i = 1; i<= n;i++) {
			for(int j = 1; j<=m;j++) {
				possibilities[i+j]++;
			}
		}
		int max = possibilities[0];
		for(int c = 0; c<= possibilities.length-1;c++) {
			if(possibilities[c] >max) {
				max = possibilities[c];
			}
		}
		for(int i = 0; i<=possibilities.length-1;i++) {
			if(possibilities[i] == max) {
				System.out.println(i);
			}
		}
	}

}
