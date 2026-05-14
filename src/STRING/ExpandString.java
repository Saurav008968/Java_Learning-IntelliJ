package STRING;

public class ExpandString {
    static void main() {
        String str="3(ab)4(bg)2(v)";
        StringBuffer original=new StringBuffer();
        int i,j;
        for( i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int n=ch-'0';
            StringBuffer temp=new StringBuffer();
            for( j=i+2;str.charAt(j)!=')';j++){
                temp.append(str.charAt(j));
            }
            for(int  k=1;k<=n;k++){
                original.append(temp);
            }
            i=j;
        }
        System.out.println(original);
    }
}
