package Solutions;

import java.util.Scanner;

public class GrassSeedInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double cost = scan.nextDouble();
		int n = scan.nextInt();
		double totalArea = 0.0;
		for(int i = 0; i<n; i++) {
			totalArea += (scan.nextDouble())*(scan.nextDouble());
		}
		System.out.println(totalArea*cost);
	}

}
