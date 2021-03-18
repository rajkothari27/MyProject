package LearningCollectionFrameWork.LearningCursors;
import java.util.*;
public class LearningListItreator {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("c");
        l.add("cpp");
        l.add("java");
        l.add("data");
        System.out.println(l);

        ListIterator lit = l.listIterator();
        while(lit.hasNext()){
            Object next = lit.next();
            if(next.equals("java")){
                lit.set("java se");

            }else if(next.equals("c")){
                lit.add("ds");
            }
            else if (next.equals("data")){
                lit.remove();
            }

        }
        System.out.println(l);
    }
}
