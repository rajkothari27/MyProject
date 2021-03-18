package LearningCollectionFrameWork.LearningCursors;

import java.util.Enumeration;
import java.util.Vector;

public class LearningEnumeration {
    public static void main(String[] args) {
        Vector v = new Vector(); //intial list 10
        v.addElement("one");
        v.addElement("two");
        v.addElement("three");
        System.out.println(v);
        Enumeration e =  v.elements();
        while(e.hasMoreElements()){
            String s = (String) e.nextElement();
            System.out.println(s+s.length());

        }


    }
}
