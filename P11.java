import java.util.*;
public class Digsum {
	public static void calc(int num) 
	   { 
	    int sum = 0;  
	    while(num > 0 || sum > 9) 
	    { 
	        if(num == 0) 
	        { 
	            num = sum; 
	            sum = 0; 
	        } 
	        sum += num % 10; 
	        num /= 10; 
	    } 
	    System.out.print(sum);
	} 
	public static void main(String args[]){
		   Scanner sc = new Scanner(System.in);
			System.out.print("Enter number:");              
			int n=sc.nextInt();
	        calc(n);
	 }
}
