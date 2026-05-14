package STRING;

public class PrintAllSubstring2 {
    static void main() {
        String str="abcs";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }
}
