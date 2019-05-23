package Solutions;

import java.util.Scanner;

public class PokerHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ar[] = new char[13];
		String ar2[] = scan.nextLine().split(" ");
		
		for(int i = 0; i<= ar2.length-1;i++) {
			if(ar2[i].charAt(0) == 'A') {
				ar[0]++;
			}else if(ar2[i].charAt(0) == 'J') {
				ar[10]++;
			}else if(ar2[i].charAt(0) == 'Q'){
				ar[11]++;
			}else if(ar2[i].charAt(0) == 'K') {
				ar[12]++;
			}else if(ar2[i].charAt(0) == 'T') {
				ar[9]++;
			}else {
				ar[Integer.parseInt("" + ar2[i].charAt(0))]++;
			}
		}
		int max = ar[0];
		for(int j = 0; j<=ar.length-1;j++) {
			if(ar[j] > max) {
				max = ar[j];
			}
		}
		System.out.println(max);
	}

}
