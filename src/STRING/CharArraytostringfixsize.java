package STRING;

public class CharArraytostringfixsize {
    static void main() {
        char [] name={'S','A','U','R','A','V'};
        String name1=new String(name,0,1);// will store from 0 index to 3-1 index
        System.out.println(name1);
        String name2=new String(name,0,5);// will store from 0 index to 3-1 index
        System.out.print(name2);
    }
}
