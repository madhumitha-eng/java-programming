import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    palindrome(n);
	    
	}
	public static void palindrome(int n){
	    int org=n;
	    int rev=0;
	    while(n>0){
	        int digit=n%10;
	       
	  	if(digit%2==0){
	  	    System.out.print(digit);
	  	}
	  	n=n/10;
	   	}
	}
}
