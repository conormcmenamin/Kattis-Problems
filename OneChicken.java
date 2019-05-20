package Solutions;
import java.util.Scanner;
public class OneChicken
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        if(n<m)
        {
            if(m-n == 1)
            {
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            }
            else
            {
                System.out.println("Dr. Chaz will have " + (m-n) + " pieces of chicken left over!");
          
            }
        }
        else if(m<n)
        {
            if(n-m == 1)
            {
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            }
            else
            {
                System.out.println("Dr. Chaz needs " + (n-m) + " more pieces of chicken!");
            }
        }
    }
}