/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static int evenodd(int arr[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		int res=(evenodd(arr,size));
		if(res%2==0){
		    System.out.println("Sum : "+res);
		    System.out.println("Category : Even");
		    
		}
		else{
		     System.out.println("Sum : "+res);
		    System.out.println("Category : Odd");
		}
		
	}
}
