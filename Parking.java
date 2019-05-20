package Solutions;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), counter = 1;
		while(counter<=n) {
			int ar[] = new int[scan.nextInt()];
			for(int i = 0; i<= ar.length-1;i++) {
				ar[i] = scan.nextInt();
			}
			int temp = 0;
			for(int i = 2; i<= ar.length;i++) {
				for(int j = 0;j<= ar.length-i;j++) {
					if(ar[j]>ar[j+1]) {
						temp = ar[j];
						ar[j] = ar[j+1];
						ar[j+1] = temp;
					}
				}
			}
			
			int sum = 0;
			for(int i = 1; i<= ar.length-1;i++) {
				sum += (ar[i]-ar[i-1]);
			}
			System.out.println(2*sum);
			sum = 0;
			temp = 0;
			counter++;
		}
	}

}
