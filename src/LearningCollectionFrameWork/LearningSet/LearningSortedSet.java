package LearningCollectionFrameWork.LearningSet;
import java.util.*;
public class LearningSortedSet {
    /*
    * sorted set is a child interface of set interface
    * duplicated are not allowed
    * elements are in sorted order
    *
    * insertion order is not preserved
    * diffrence between set and sorted set:
    * in set order is not important
    * in sorted set order is important(logical sort order   )
    *
    * sorted set child interface is navagiable set and tree set is class
    * */
    public static void main(String[] args) {
        TreeSet t =  new TreeSet();
        t.add("a");
        t.add("b");
        t.add("d");
        t.add("c");
        System.out.println(t.first()); // gives output in sorted order as data is stored in sorted order
        System.out.println(t.headSet("c")); //prints less than element c so a and b printed
        System.out.println(t.tailSet("c")); // return element greater than or equal to element c,d
        System.out.println(t.subSet("b","d")); // return value inculsive b and exculde d print b ,c
        System.out.println(t.comparator());//if this follow natural order sorting it will return null (natural order numbers(asc) and string (dictionary))
        System.out.println(t.ceiling("c")); //greater value or equal value to it
        System.out.println(t.floor("g")); //lower value or equal value of it
        System.out.println(t.higher("b")); // exactly higgher value of b
        System.out.println(t.lower("d")); //exactly lower value of d
        System.out.println(t.pollFirst()); // remove the first lower value or null if empty
        System.out.println(t.pollLast()); // removes the highest element or null if empty


    }
}
