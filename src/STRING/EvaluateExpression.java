package STRING;

public class EvaluateExpression {
    static int exp(String [] arr){
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=="x++" || arr[i]=="++x")    x++;
            else x--;
        }
        return x;
    }

    static void main() {
        String arr[]={"x--","x--","--x","x--","x++","x++"};
        System.out.println(exp(arr));
    }
}
