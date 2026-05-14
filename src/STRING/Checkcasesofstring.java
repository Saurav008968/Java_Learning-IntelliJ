package STRING;

import java.net.SocketOption;
import java.net.StandardSocketOptions;

public class Checkcasesofstring {
    static void main() {


    String s1="Rahul";
    String s2="Rahul";
    String s3="rAHuL";
    String s4="Saurav";
    System.out.println(s1.equals(s2));//.eqals ised to compare contene also notice cases upper nd lower
    System.out.println(s1.equals(s3));//return false due to cases
    System.out.println(s1.equalsIgnoreCase(s3));//return true bcz ignore cases
    System.out.println(s1.equals(s4));//return false bcz has diff characyters
    System.out.print(s1==s2);//return true bcs has the same address in SCP
}}
