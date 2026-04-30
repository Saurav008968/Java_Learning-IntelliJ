package ARRAYS;
import java.util.Arrays;
public class DeleteElement {
    static void ram(int arr[],int del){
        int size=arr.length;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==del){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                size--;
                break;


            }


        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static void main(String[] args) {
        int arr[]={33,56,78,9,45,36,56,79,12,13,14,48,68};
        int n=36;
        ram(arr,n);
    }

}