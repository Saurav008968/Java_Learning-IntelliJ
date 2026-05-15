package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;
public class SortARRListUsingMethod {
    static void main() {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(36);
        list.add(12);
        Collections.sort(list);        // SORT IN INCREASING ORDER.,#####
        System.out.println("Ascending" +list);
        Collections.sort(list,Collections.reverseOrder());// SORT IN DECREASING ORDER.,#####
        System.out.println("Decsending" +list);

    }
}
