package Solutions;

import java.util.Scanner;

public class Cold_puterScience {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int counter = 0;
		for(int i = 0; i<= n-1; i++) {
			int num = Integer.parseInt(scan.next());
			if(num<0) counter++;
		}
		System.out.println(counter);

	}

}
