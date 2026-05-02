package ARRAYS;

public class PrintAllSubArray {
    static void ram(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    static void main() {
        int []arr={1,2,3};
        ram(arr);
    }
}
