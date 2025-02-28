package TwoDArray;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class arrListInTwoD {
     // This is ArrayList in Two Dimensional array List:
    public static void main(String[] args) {


        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(15);
        List<Integer> b = new ArrayList<>();
        b.add(45);
        List<Integer> c = new ArrayList<>();
        c.add(65);
        c.add(62);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i)+" ");
        }
    }
}
