import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    square(n);
	    
	}
	public static void square(int n){
	    for(int i=1;i<=n;i++){
	        int sqr=i*i;
	        System.out.println(i+"*"+i+"="+sqr);
	    }
	}
}
