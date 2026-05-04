package SORTINGARRAYS;
import java.util.Arrays;
public class SelectionSort {
    static void main() {
        int [] arr={6,1,4,9,2,7,5};
        int minindex=-1;
        for(int i=0;i<arr.length-1;i++){
            minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minindex]>arr[j]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
                 arr[i]=temp;

        }
        System.out.print(Arrays.toString(arr));
    }

}
