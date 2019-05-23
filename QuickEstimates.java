package Solutions;

import java.util.Scanner;

public class QuickEstimates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine()),counter = 0, digits = 0;
		String ar[] = new String[n];
		
		for(int i = 0; i<=n-1;i++) {
			ar[i] = scan.nextLine();
		}
		while(counter<=n-1) {
			
			
			System.out.println(ar[counter].length());
			digits = 0;
			counter++;
		}
	}

}
