package STRING;

public class StringCompression {
    static void compression(String s){
        int i=0;

        StringBuffer sb=new StringBuffer();
        while(i<s.length()){
            char ch=s.charAt(i);
            int count=0;
           while(i<s.length()){
               if(ch==s.charAt(i)){
                   count++;
                   i++;
               }
               else {
                   break;
               }
           }
           sb.append(ch);
           if(count>1)  sb.append(count);

        }
        System.out.println(sb);

    }

    static void main() {
        compression("aaabbbbccddeeffggg");
    }
}
