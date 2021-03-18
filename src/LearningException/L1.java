package LearningException;

public class L1 {
    public static void main(String[] args) {
        //String s1 ; //local variable not intialized
        String s1 = null; //null pointer exception , because s1 is intialized pointing to  null
        System.out.println("first line "); // this will run
        System.out.println(s1.length()); // this is compile time error , null pointer exception
        System.out.println("last line "); // this will not run

    }
}
