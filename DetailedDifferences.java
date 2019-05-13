package Solutions;

import java.util.Scanner;

public class DetailedDifferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next()), counter = 0;
		String ar[][] = new String [n][3];
		String s = "";
		String g = "";
		
		String out = "";
		
		while(counter<n) {
			ar[counter][0] = scan.next();
			ar[counter][1] = scan.next();
			for(int i = 0; i<= ar[counter][0].length()-1;i++) {
				if(ar[counter][0].charAt(i) == ar[counter][1].charAt(i)) {
					out += ".";
				}else {
					out+= "*";
				}
			}
			ar[counter][2] = out;
			out = "";
			counter++;
			
		}
		for(int i = 0; i<=ar.length-1;i++) {
			System.out.println(ar[i][0] + "\n" + ar[i][1] + "\n" + ar[i][2] );
		}
	}

}
