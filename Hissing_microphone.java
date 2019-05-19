package Solutions;
import java.util.*;
public class Hissing_microphone {
	
	    public static void main(String args[]){
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        
	        if(s.matches("^.*ss+.*$")){
	            System.out.println("hiss");
	        }
	        else{
	            System.out.println("no hiss");
	        }
	    
	}
	 
}
