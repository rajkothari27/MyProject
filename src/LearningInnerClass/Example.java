package LearningInnerClass;

//outer class
public class Example {
    int x=10; // member variable
    void f1(){} // member function
    class inner{
        void f2(){
            System.out.println("printing inner class method which is non static class ");
        }
        //non static inner class can access outer class variable and method
        void f3(){
            System.out.println("printing outer class value in non static inner class " + x);
        }


    } //inner class or nested class

    static class Inner2{
        void f2(){
            System.out.println("printing inner class method which is static ");
        }
        //static inner class cannot access the variable and method of outer class
        //static inner class can only access static member of outer class

    } //instance member static inner class
}

class Example2{
    public static void main(String[] args) {
        Example e1 = new Example(); //object of example class

        /*
        * if you want to access the inner class which is non static
        * you ned to create a object of outer class
        * then using . access the inner class and make a new object of inner class
        * example below
        * */
        Example.inner e2 = e1.new inner();
        e2.f2();
        e2.f3();

        /*
        * using inner class of example
        * by using . we are excessing static member of class
        * */
        Example.Inner2 e3 = new Example.Inner2();
       e3.f2();



    }
}
