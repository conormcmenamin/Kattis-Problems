package Solutions;

import java.util.Scanner;

public class Datum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ar[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String ar2[] = {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
		int day = scan.nextInt(), month = scan.nextInt();
		
		int sum = day;
		for(int i =month-1;i>=0;i--) {
			sum+= ar[i];
		}
		int dow = sum%7;
		System.out.println(ar2[dow]);
		
	}

}
