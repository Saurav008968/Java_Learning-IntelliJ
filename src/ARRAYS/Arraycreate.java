package ARRAYS;
import java.util.*;
public class Arraycreate {
    static void array(int arr[]){
        System.out.print(Arrays.toString(arr));

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        array(arr);
    }

}
