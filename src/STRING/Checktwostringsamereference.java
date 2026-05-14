package STRING;

public class Checktwostringsamereference {
    static void main() {
        String city1="Bhopal";
        String city2="Bhopal";
        String city3="Ranchi";
        System.out.println(city1==city2);//return true bcs city1 nd city2 has similar address of bhopal
        System.out.println(city2==city3);//return false bcs city2 and city3 has diff addresses

    }
}
