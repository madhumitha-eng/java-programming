import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    add(n);
	}
	public static void add(int n){
	    int sum=0;
	    while(n>0){
	        int digit =n%10;
	        if(n%2==0){
	            sum=sum+digit;
	        }
	        n=n/10;
	    }
	    System.out.print(sum);
	}
}
