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
	       rev=rev*10+digit;
	        n=n/10;
	    }
	  	if(org==rev){
	  	    System.out.print("Palindrome");
	  	}
	  	else{
	  	    System.out.print("Not Palindrome");
	  	}
	   	}
}
