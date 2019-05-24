package Solutions;

import java.util.Scanner;

public class Skener {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt(), cols = scan.nextInt(), zr = scan.nextInt(), zc = scan.nextInt();
		String ar[] = new String[rows];
		
		for(int i = 0; i<=rows-1;i++) {
			ar[i] = scan.next();
		}
		
		for(int i = 0; i<rows;i++) {
			for(int k = 0; k<zr;k++) {
				for(int j = 0; j<cols;j++) {
					for(int l = 0; l<zc;l++) {
						System.out.print(ar[i].charAt(j));
					}
					
				}
				System.out.println("");
			}
			
		}
	}
}
