package Solutions;

import java.util.Scanner;

public class TheAmazingHumanCannonball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1 ; i<= n;i++) {
			double v0 = Double.parseDouble(scan.next());
			double theta = Double.parseDouble(scan.next());
			double x1 = Double.parseDouble(scan.next());
			double h1 = Double.parseDouble(scan.next());
			double h2 = Double.parseDouble(scan.next());
			System.out.println(isSafe(v0,theta,x1,h1,h2));
		}
	}
	static String isSafe(double v0, double theta, double x1, double h1, double h2) {
		theta = theta*Math.PI/180.0;
		double t = x1/(Math.cos(theta)*v0);
		double y1 = v0*t*Math.sin(theta) - 0.5*(9.81)*Math.pow(t, 2);
		
		if((y1-h1 >=1) && (h2-y1 >=1)) {
			return "Safe";
		}else {
			return "Not Safe";
		}
	}

}
