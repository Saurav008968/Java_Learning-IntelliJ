package ARRAYS;
//Given an array of integers arr, check whether the array is sorted in non-decreasing order
//  (i.e., every element is greater than or equal to the previous one).
//Return true if sorted, otherwise return false.
public class CheckSortedArray {
    static boolean checksort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,7,7};
        if(checksort(arr)){
            System.out.println(" sorted");
        }
        else{
            System.out.println(" Not sorted");
        }
    }

}
