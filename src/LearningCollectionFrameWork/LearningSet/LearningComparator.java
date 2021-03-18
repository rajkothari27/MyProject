package LearningCollectionFrameWork.LearningSet;
import java.util.*;
public class LearningComparator {
    /*
    * compartor interface used to custom sorting
    * */
    public static void main(String[] args) {
        Book b1 =  new Book("RAJ",20);
        Book b2 =  new Book("shimoli",30);
        Book b3 =  new Book("balze",10);
        TreeSet t = new TreeSet(new MyComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);
        Book b = null;
        Iterator it = t.iterator();

        while(it.hasNext()){
           b =(Book) it.next();
        }
        System.out.println(b.getTitle() + b.Price);


    }
}
class MyComparator implements Comparator{

/*
* to sort according to price for custom sort we need to implement Comparator
*  override the compare method 01 represent added object of book in 01 object
    * while 02 is used to compare the object in the tree set
    *
    * */
    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book)o1;
        Book book2 = (Book) o2;
        if (book1.getPrice() < book2.getPrice()) {
            return -1;
        }
        //if book price is equal still it should go to else block return postive value
        else{
            return 1;
        }
    }
}
class Book{
    String title;
    int Price;

    public Book(String title, int price) {
        this.title = title;
        Price = price;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return Price;
    }
}
