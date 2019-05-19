package Solutions;
import java.util.*;
public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double h = scan.nextDouble();
		double v = scan.nextDouble();
		v = v*Math.PI/180.0;
		double length =h/Math.sin(v);
		if(length%1 >0.0) {
			length++;
		}
		length -= length%1;
		System.out.println((int)length);
	}

}
