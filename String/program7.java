import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		palindrome(s);
	}
	public static void palindrome(String s){
	    char [] ch=s.toCharArray();
	    int start =0;
	    int end=ch.length-1;
	    while(start<end){
	        if(ch[start]!=ch[end]){
	            System.out.print("Not Plaindrome");
	            return;
	        }
	        start++;
	        end--;
	    }
	    System.out.print("palindrome");
	}
}
