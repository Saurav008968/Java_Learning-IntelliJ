package STRINGBUFFER;

public class CapacityndSizeofBuffer {
    static void main() {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.length());//blank stringbuffer so 0
        System.out.println(sb.capacity());//by default assigh=ned as 16 initially
        System.out.println("============");
        StringBuffer sb1=new StringBuffer("DSA");
        System.out.println(sb1);
        System.out.println(sb1.length());//3
        System.out.println(sb1.capacity());//3+16=19
        System.out.println("=============");
        sb1.append(" Placement");
        System.out.println(sb1);
        System.out.println(sb1.length());//3+10=13
        System.out.println(sb1.capacity());//13<19 so capacity still is 19
        System.out.println("=============");
        sb1.append(" Series");
        System.out.println(sb1);
        System.out.println(sb1.length());// 13+7=20, more than 19 inhance capacity by oldcapacity*2+2
        System.out.println(sb1.capacity());//19*2+2=40
        System.out.println("=============");
    }
}
