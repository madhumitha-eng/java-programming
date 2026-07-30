import java.util.Scanner;
public class Main{
public static void duplicate(int arr[],int size){
    boolean visited[]=new boolean[size];
    for (int i=0;i<size;i++){
    if(visited[i])
    continue;
    int count=1;
    for(int j=i+1;j<size;j++){
        if(arr[i]==arr[j]){
            count++;
        }
    }
    if(count>1)
    System.out.println(arr[i]+" "+count);
    }
}
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int [size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    duplicate(arr,size);
}
}
