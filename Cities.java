package thePackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Cities{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int t  = scan.nextInt();
        
        for(int i = 1; i<=t;i++){
            int n = Integer.parseInt(scan.next());
            HashSet<String> set = new HashSet<>();
            
            for(int j= 1; j<=n;j++){
                set.add(scan.next());
            }
            ar.add(set.size());
            set.clear();
        }
        
        for(int i=0;i<=ar.size()-1;++i) {
        	System.out.println(ar.get(i));
        }
        scan.close();
    }
}
