import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printchar(s);
	}
	public static void printchar(String s){
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(ch>='0'&&ch<='9')
	        System.out.print(ch);
	    }
	}
}
