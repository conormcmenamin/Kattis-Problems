package Solutions;

import java.util.Scanner;

public class Apaxians
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        String in = new String(scan.nextLine());
        in = cleanString(in);
        System.out.println(in);
    }
    public static String cleanString(String n)
    {
        for(int i = 0; i <= n.length()-2;i++) {
        	if(n.charAt(i) == n.charAt(i+1)) {
        		String g = n.substring(0,i);
        		n = n.substring(i+1);
        		n = g + n;
        		i--;
        	}
        }
        return n;
        
    }
}