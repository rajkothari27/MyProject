package LearningCollections;
import java.util.*;
public class LearningCollections {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(20);
        v.add(30);
        v.add(10);
        v.add(50);
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v); //sorted output using collections
        int i = Collections.binarySearch(v, 30); // returns index number of element, binary search only works on sorted list
        System.out.println(v);
        System.out.println(i);
        Collections.swap(v,1,3);
        System.out.println(v);
        Collections.shuffle(v);
        System.out.println(v);

    }
}
