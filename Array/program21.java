import java.util.Scanner;
public class Main{
public static void duplicateFrist(int arr[],int size){
    boolean found=false;
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
                System.out.print(arr[i]);
            found=true;
            break;
        }
    }
    if(found)
    break;
    }
}
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int [size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    duplicateFrist(arr,size);
}
}
