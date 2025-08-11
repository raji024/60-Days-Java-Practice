package ArrayList1;
import java.util.*;
public class array_in_arraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>n = new ArrayList<>();
        ArrayList<Integer> m1 = new ArrayList<>();
        m1.add(1);
        m1.add(2);
        ArrayList<Integer> m2 = new ArrayList<>();
        m2.add(7);
        m2.add(9);
        n.add(m1);
        n.add(m2);
        System.out.println(n);


    }
}
