package LearningCollectionFrameWork;

import LearningInterface.A;

import java.util.*;

public class LearningArrayList {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList(4);
        //dynamic array list can increase and decrease size if you add more element then intial capcity it will increase on runtime
         l1.add(1);
         l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1);

        /*
        * array list constructor
        * not giving arraylist size
        * by default capcity is 10
        * to increase its capcity ,new capcity = 10 *3/2+1
        * */
        ArrayList l2 = new ArrayList();




    }
}
class Example{
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList(4);
        l1.add("AJAY");
        l1.add(1,"Romesh");
        l1.add("Rahul");
        Iterator it = l1.iterator(); //itreator is used to print all values in list
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
