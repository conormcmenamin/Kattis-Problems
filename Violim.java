package Solutions;

import java.util.Scanner;

public class Violim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int end = scan.nextInt();
		int n = scan.nextInt();
		int seconds = 0;
		int counter = 1;
		int current = scan.nextInt();
		while (seconds+current < 210 && counter<=n) {
			seconds+= current;
			if(scan.next().equals("T")) {
				end++;
			}
			if(end>8) {
				end = 1;
			}
			counter++;
			current = scan.nextInt();
		}
		System.out.println(end);

	}

}
