package Solutions;

import java.util.Scanner;

public class Quality_adjusted_life_year 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double ar[][] = new double[n][2];
		
		double qaly = 0.0;
		for(int i = 0; i<= n-1; i++ )
		{
			for(int j = 0; j<= 1; j++)
			{
				ar[i][j] = scan.nextDouble();
			}
			qaly += (double)(ar[i][0] *ar[i][1]);
		}
		
		qaly = (Math.round(qaly*1000.0))/1000.0;
		System.out.println(qaly);
	}
}
