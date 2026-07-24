import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int res=rev(n);
	    System.out.print(res);
	    
	}
	public static int rev(int n){
	    int rev=0;
	    while(n>0){
	        int digit=n%10;
	        rev=rev *10+digit;
	        
	        
	        n=n/10;
	    }
	  	return rev;
	   	}
}
