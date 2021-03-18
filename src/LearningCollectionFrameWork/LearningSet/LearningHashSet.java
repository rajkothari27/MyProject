package LearningCollectionFrameWork.LearningSet;
import java.util.*;
public class LearningHashSet {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("one");
        h.add("two");
        h.add("three");
        h.add("four");
        h.add("five");
        /*
        * inseration order is not preserved
        * */
        System.out.println(h);

    }
}
