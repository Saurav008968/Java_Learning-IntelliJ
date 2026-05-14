package STRING;

public class Checkstringusingnewkeyword {
    static void main() {
        String city4=new String("Bhopal");
        String city5=new String("Bhopal");
        System.out.println(city4==city5);//return false bcs here city4nd city5 has diff addresses for bhopal.
        System.out.println(city4.equals(city5));//return true bcs here city4nd city5 has same value for bhopal.
        System.out.println("===================");
        String  s="shubham";
          String s1="shubham";
        System.out.println(s==s1);// == is used for check address. will retrn true bcs have same address
        System.out.println(s.equals(s1));//.equals is used for checking value assigned to the string.
    }
}
