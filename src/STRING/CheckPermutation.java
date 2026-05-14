package STRING;

public class CheckPermutation {
    static boolean isPal(String s1,String s2){
        if(s1.length()!=s2.length())  return false;
        int x;
        int [] arr=new int[256];
        for(int i=0;i<s1.length();i++){
            x=s1.charAt(i);
            arr[x]++;
            x=s2.charAt(i);
            arr[x]--;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)  return false;

            }
        return true;
    }

    static void main() {
        System.out.println(isPal("abcd","dcbd"));
    }
}
