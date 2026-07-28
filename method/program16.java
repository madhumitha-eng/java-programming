import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    prime(n);
	}
	public static void prime (int n){
	    while(n>0){
	        int digit=n%10;
	        if(digit==3||digit==5||digit==7){
	            System.out.print(digit+" ");
	        }
	        n=n/10;
	    }
	}
	
	
}
