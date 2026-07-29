import java.util.Scanner;
public class Main
{
    static boolean checksorted(int arr[],int size){
        for (int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	    arr[i]=sc.nextInt();
	    }
	    if(checksorted(arr,size))
	    System.out.print("Sorted array");
	    
	    else	   
	    System.out.print("not Sorted array");

	}
}
