package LearningException;
/*
*our throw and default catch example
*
* */

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
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

        int balance = 10000;
        int withdrawlbalance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your intial balance is : $" + balance);
        System.out.printf("enter withdrawl amount : $ ");
        withdrawlbalance = sc.nextInt();
        if(balance<withdrawlbalance){
            throw new ArithmeticException("insufficent balance ");
        }else{
            int newBalance = balance-withdrawlbalance;
            System.out.println("--------------------Transaction successfull------------------------");
            System.out.println("new balance : $ " + newBalance);
            System.out.println("you withdraw amount : $ " + withdrawlbalance);
        }



    }
}
