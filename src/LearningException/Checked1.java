package LearningException;

import java.io.IOException;

/*
* checked exception example
* */
public class Checked1  {
    //this exception comes at complie time
    public static void main(String[] args) {
        try{  throw new IOException();}catch(IOException e){
            System.out.println("exception" + e.getMessage());
        }

       // System.out.println("after exception"); // this line will not run because above we are force fully running exception ,
        //line not reachable
    }
}
