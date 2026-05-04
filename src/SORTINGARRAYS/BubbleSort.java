package SORTINGARRAYS;
import java.util.*;
public class BubbleSort {
    static void main() {
        int [] arr={2,9,39,12,1,76,16,43,5,19,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
