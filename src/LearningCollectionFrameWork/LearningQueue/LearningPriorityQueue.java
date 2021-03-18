package LearningCollectionFrameWork.LearningQueue;
import java.util.*;
public class LearningPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        //inseration order is not saved in priority queue
        pq.add("A");
        pq.offer("B");
        pq.offer("d");
        pq.add("c");
        System.out.println(pq);
        //pool returns the element that is deleted , its return value and delete and delete in natural sorting order
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
