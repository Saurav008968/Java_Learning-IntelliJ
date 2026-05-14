package STRINGBUFFER;

import java.sql.SQLOutput;

public class EnsurecapacityMethod {
    static void main() {
        StringBuffer sb= new StringBuffer("DSA");
        System.out.println(sb);//DSA
        System.out.println(sb.length());//3

        System.out.println(sb.capacity());//3+16=19
        System.out.println("===========");
        sb.ensureCapacity(25);

        System.out.println(sb.capacity());//40(19*2+2), bcs 25<19*2+2
        System.out.println("==========");
        sb.ensureCapacity(100);

        System.out.println(sb.capacity());//100 ,bcs 100> 40*2+2
        System.out.println("==========");
        sb.ensureCapacity(150);
        System.out.println(sb.capacity());// 202 (100*2+2) ,bcz 150< 100*2+2
    }
}
