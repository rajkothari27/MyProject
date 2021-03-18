package LearningCollectionFrameWork.LearningSet;
import java.util.*;
public class LearningLinkedHashSet {
    public static void main(String[] args) {
        /*
        * insertion order is preserved
        * hybrid tables: use hash table and doubly linked list (can go back and forward in data using pointer and node just as
        * linked list )
        *linked hash set default capicty 16 , if filled 75% then the set capcity increase automatically
        * load factor 0.75
        *
        * duplicate not allowed
        * */

        LinkedHashSet hs = new LinkedHashSet();
        for (int i = 0; i < 10; i++) {
            hs.add(i);

        }
        hs.add(1);
        System.out.println(hs);

    }
}
