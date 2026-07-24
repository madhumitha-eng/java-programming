import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    digit(n);
	    
	}
	public static void digit(int n){
	    int sum=0;
	    while(n>0){
	        int digit=n%10;
	        
	        System.out.println(digit);
	        n=n/10;
	    }
	  
	}
}
