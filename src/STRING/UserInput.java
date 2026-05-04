package STRING;
import java.util.Scanner;
public class UserInput {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name");
        String str=sc.next();
        // using next() so it will only take first sentence

    System.out.print("Your name is:" +str);
    }
}
