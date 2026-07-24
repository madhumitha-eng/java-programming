import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	   int res= print(n);
	   System.out.print(res);
	    
	}
	public static int print(int n){
	    int sum=0;
	    for(int i = 0; i <=n; i++){
	        sum=sum+i;
	        
	    }
	    return sum;
	}
}
