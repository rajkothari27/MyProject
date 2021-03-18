package LearningGenerics;
//generic class example
//<T> is place holder for class
class MyData <T>{
    /*
    * place holder are always refering to objects , they dont refer to primitive type (int,float etc) and string
    * */
    T i; //place hodler for data type for variable i , value place in <T> will be same to this T
    public void  add(T i1){ i=i1;} //place holder for data type of method

    public T getI() { //place holder for data type of method
        return i;
    }
    //this T will be intialized when object of class is created
}
public class ExampleGenricClass {
    public static void main(String[] args) {
    MyData <Integer> m1 = new MyData<Integer>(); // creating object of class MyData, intializing the data type for placholder of
        // class and methods and variables in it

        MyData <String> m2 = new MyData<String>(); // creating object of class MyData, intializing the data type for placholder of
        // class and methods and variables in it

        m1.add(5);
        m2.add("Raj");
        System.out.println("value in object m1 " + m1.getI());
        System.out.println("value in object m2 " + m2.getI());

    }
}
