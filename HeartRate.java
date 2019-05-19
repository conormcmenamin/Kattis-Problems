package Solutions;

import java.util.Scanner;

public class HeartRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int counter = 1;
		while(counter<=n) {
			double beats = Double.parseDouble(scan.next());
			double sec = scan.nextDouble();
			double bpm = (60*beats/sec);
			double minabpm = bpm - (beats/sec)*(60/beats);
			double maxabpm = bpm + (beats/sec)*(60/beats);
			System.out.println(Math.round(minabpm*10000.0)/10000.0 +" "+ Math.round(bpm*10000.0)/10000.0 +" " + Math.round(maxabpm*10000.0)/10000.0);
			
			
			
			counter++;
		}
	}

}
