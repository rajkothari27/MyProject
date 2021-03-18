package LearningThread;
import java.util.*;

public class LearningThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread (new B());
        t1.start();
        t2.start();
        //this run together no fix sequence

    }
}
//attaching threads
class A implements Runnable{
    @Override
    public void run() {
        int i;
        for (int j = 0; j <= 10; j++) {
            System.out.println("Thread A Running"+ j);
        }
    }
}
class B implements Runnable{
    @Override
    public void run() {
        int i;
        for (int j = 0; j <= 10; j++) {
            System.out.println("Thread B Running"+ j);
        }
    }
}
