package Solutions;
import java.util.*;
public class Fillip 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int storeMax = 0;
		
		for(int i =0; i<= 2; i++)
		{
			if(n%Math.pow(10,i+1) > m%Math.pow(10,i+1))
			{
				storeMax = n;
				break;
			}
			else if(m%Math.pow(10,i+1) > n%Math.pow(10, i+1))
			{
				storeMax = m;
				break;
			}
			
		}
		while(storeMax>0)
		{
			System.out.print(storeMax%10);
			storeMax/=10;
		}
		
	}
}
