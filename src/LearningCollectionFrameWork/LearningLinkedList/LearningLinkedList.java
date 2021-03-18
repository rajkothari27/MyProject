package LearningCollectionFrameWork.LearningLinkedList;
import java.util.*;


public class LearningLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("Raj");
        list.add(1,"Blaze");
        list.addLast("shimoli");
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
        System.out.println(list.getLast());
        System.out.println(list.listIterator(0));

    }
}
