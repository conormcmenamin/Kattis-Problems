package Solutions;

import java.util.Scanner;

public class BatterUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ar[] = new int[scan.nextInt()];
		double plays = 0.0;
		double sum = 0.0;
		for(int i = 0; i<= ar.length-1;i++) {
			ar[i] = scan.nextInt();
			if(ar[i] !=-1) {
				plays+=1.0;
				sum += ar[i];
			}
		}
		System.out.println(sum/plays);
	}

}
