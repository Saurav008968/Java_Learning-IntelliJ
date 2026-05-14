package STRING;

// A pangram contains all the letters of english alphabet
public class CheckPangram {

    static boolean pangram(String s) {

        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++) {

            if(Character.isLetter(s.charAt(i))) {

                char ch = s.charAt(i);

                ch = Character.toUpperCase(ch);

                int n = ch - 'A';

                arr[n] = 1;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(
                pangram("the quick brown fox jumps over the lazy dog")
        );
    }
}