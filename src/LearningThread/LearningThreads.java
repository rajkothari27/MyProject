package LearningThread;

public class LearningThreads extends Thread{
    public void run(){
        int i;
        for (int j = 1; j <=10 ; j++) {
            System.out.println("i="+j+"Thread 1");
        }
    }
}
class B1 extends Thread{
    public void run(){
        int i;
        for (int j = 1; j <=10 ; j++) {
            System.out.println("i="+j+"Thread 2");
        }
    }
}
class Ex{
    public static void main(String[] args) {
        LearningThreads o1 = new LearningThreads();
        B1 o2 = new B1();
        o1.start();
        o2.start();
    }
}
