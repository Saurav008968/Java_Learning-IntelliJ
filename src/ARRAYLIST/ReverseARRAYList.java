package ARRAYLIST;
import java.util.*;
public class ReverseARRAYList {

    static void main() {
        ArrayList <Integer> list=new ArrayList<> (Arrays.asList(3,5,8,0,43,2,5,6));
        int i=0;
        int j=list.size()-1;
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println(list);
    }
}
