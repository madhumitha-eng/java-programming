       import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		vowel(s);
	}
	public static void vowel(String s){
	    char [] ch=s.toCharArray();
	    int start =0;
	    int end=ch.length-1;
	    while(start<end){
	        char t=ch[start];
	        ch[start]=ch[end];
	        ch[end]=t;
	        start++;
	        end--;
	    }
	    System.out.print(ch);
	}
}
                                                                                                           hy8
