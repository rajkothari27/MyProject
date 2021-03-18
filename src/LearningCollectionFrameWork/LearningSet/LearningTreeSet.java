package LearningCollectionFrameWork.LearningSet;
import java.util.*;
public class LearningTreeSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        /*
        * deafult sorting works for integer and string because they implement comparable interface
        * comparable interface also checks duplicate , even you pass duplicate it will be added to tree once
        * if you pass string buffer in tree set it will not do sorting as string buffer is diffrent class
        * throws exception class cast type
        * */
        t.add(new StringBuffer("a"));
        t.add(new StringBuffer("b"));
        t.add(new StringBuffer("c"));
        // throws exception class cast type
        System.out.println(t);
    }
}
