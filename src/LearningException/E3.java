package LearningException;
/*
* our throw our catch example
* */

import java.util.Scanner;

public class E3 {
    /*
     * a program can explicitly throw an exception
     * using the throw statment beside the
     * implicit exception thrown
     *
     * syntax:
     * throw<throwableinstance>;
     *
     * we can use our own error message
     * */
    public static void main(String[] args) {
        int balance = 10000;
        int withdrawlbalance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your intial balance is : $" + balance);
        System.out.printf("enter withdrawl amount : $ ");
        withdrawlbalance = sc.nextInt();
        try{
            if(balance<withdrawlbalance)
                throw new ArithmeticException("insufficent balance ");
                int newBalance = balance-withdrawlbalance;
                System.out.println("--------------------Transaction successfull------------------------");
                System.out.println("new balance : $ " + newBalance);
                System.out.println("you withdraw amount : $ " + withdrawlbalance);

        }
        catch(ArithmeticException e){
            System.out.println("exception  : " + e.getMessage());
            //this will take the error message that we gave to our exception and print if exception is there

        }
    }

}
