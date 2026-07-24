import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    
	    if(n%5==0&&n%11==0){
	        System.out.print("divisible by both 5&11");
	    }
	    
	    else {
		System.out.println("not divisible by both 5&11");
	    }
	}
}
