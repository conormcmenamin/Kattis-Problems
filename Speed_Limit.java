package Solutions;

import java.util.Scanner;

public class Speed_Limit 
{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();				//Take in number of partitions in a journey
		while(n != -1) {
			
			int ar[][] = new int[n][2];
			int sum = 0;
			for(int i = 0; i<= ar.length-1;i++) {
				ar[i][0] = scan.nextInt();
				ar[i][1] = scan.nextInt();
				if(i ==0) {
					sum += ar[i][0]*ar[i][1];
				}else {
					sum += ar[i][0]*(ar[i][1]-ar[i-1][1]);
				}
			}
			System.out.println(sum + " miles");
			n = scan.nextInt();
		}
		
	}

}
