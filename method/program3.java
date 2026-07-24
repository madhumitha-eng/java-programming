import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    print(n);
	    
	}
	public static void print(int n){
	    for(int i = 1; i <=n; i+2){
	        System.out.println(i);
	    }
	}
}
