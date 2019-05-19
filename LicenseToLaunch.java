package Solutions;


import java.util.*;
public class LicenseToLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int counter = 0;
		int min = 0;
		int current = 0;
		int minPos = 0;
		while(counter<n) {
			current = scan.nextInt();
			if(counter == 0) {
				min = current;
			}else {
				if(current<min) {
					min = current;
					minPos = counter;
				}
				
			}
			counter++;
		}
		System.out.println(minPos);
		
	}

}
