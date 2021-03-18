package LearningException;
/*
* default throw and our catch example
* */
public class E1 {
    public static void main(String[] args) {
        String s1=null;
        try{
            System.out.println(3/0); //this will throw exception
            System.out.println("In try"); // this will not run because it depend on the above code and because their is exception in above code
            System.out.println(s1.length()); // this is a null pointer exception , but this will not run as the first line has arthimetic exception
            // try block if catches any above line as exception it will throw error messages and end the try catch block
        }catch(ArithmeticException e){
            //this will catch the above exception thats is of object Arithmetic Exception and variable e is reference variable
            System.out.println("Excepetion" + e.getMessage()); //throwable class have getmessage
        }catch(NullPointerException e){
            System.out.println("Excepetion" + e.getMessage());  //throwable class have getmessage
        }
        System.out.println("hello");//if our exception works the code after the catch block will work , this line will print
        // if our exception not work then java default catch mechacnism will work and will end the code

    }
}
