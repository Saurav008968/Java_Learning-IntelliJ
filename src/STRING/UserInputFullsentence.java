package STRING;
import java.util.Scanner;
public class UserInputFullsentence {
    static void main() {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        System.out.print("Your full name is :" +str);
    }
}
