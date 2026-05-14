package STRING;
/*estrictive Candy Crush

Given a string s, the task is to reduce the string by applying the following operation:
Choose a group of 2 consecutive identical characters and remove them.
The operation can be performed any number of times until it is no longer possible.
Test Case 1s = "good"
Output:gd
Explanation:
"good"
 → remove "oo"
 → "gd"
Test Case 2
s = "oppo"
Output:(empty string)
Test Case 3
s = "google"
Output:le*/
public class RestrictiveCandyCrush {
    static void candy(String str){
        StringBuffer sb=new StringBuffer(str);
        int i=0;
        while(i<sb.length()-1){
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(i+1);
            if(ch1==ch2){
                sb.delete(i,i+2);
                if(i!=0)
                    i--;
                continue;
            }
            i++;
        }
        System.out.println(sb);
    }

    static void main() {
        candy("google");
    }

}
