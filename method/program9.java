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
	    int count=0;
	    while(n>0){
	        int digit=n%10;
	       count++;
	        n=n/10;
	    }
	  	return count;
	   	}
}
