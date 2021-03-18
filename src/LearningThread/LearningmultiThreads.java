package LearningThread;
import java.util.*;
public class LearningmultiThreads {
    public static void main(String[] args) {
     Account a1 = new Account(1000);
     Customer c1= new Customer(a1,"Raj");
     Customer c2 = new Customer(a1,"shimoli");
     Thread t1 = new Thread(c1);
     Thread t2 = new Thread(c2);
     t1.start();
     t2.start();

    }

}
class Account{
    int bal;
    public Account(int bal){
        this.bal = bal;
    }
    public boolean isSufficentBalance(int withdraw){
        if (bal > withdraw){
            return true;
        }
        else{
            return false;
        }
    }
    public void wid(int amount){
        bal=bal-amount;
        System.out.println("withdrawl amount : " + amount);
        System.out.println("your new balance : " + bal);
    }

}
class Customer implements Runnable{


    Account ac;
    String name;

    public Customer(Account ac,String name) {
        this.ac = ac;
        this.name = name;
    }
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        synchronized (ac) {
            //using synchronized to avoid multithreading accessing one rsource at same time
            // this will allow one thread to access this resource at time , while othre thread has to wait
            System.out.println(name+ ",enter your ammount to withdraw : ");
            int amt = sc.nextInt();
            if (ac.isSufficentBalance(amt)) {
                System.out.println(name);
                ac.wid(amt);
            } else {
                System.out.println("insufficent balance ");
            }
        }

    }
}