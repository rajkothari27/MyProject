package LearningAnonymous;

class Greeting{
    void sayHello(){
        System.out.println("Hello");
    }
}

class India{
    //outer class
    class GreetingIndia{
        // inner class or nested class
    }
    Greeting g = new Greeting(){
        /*
        * syntax for anonmous class
        * parent class name reference variable refering to parent is equal to new Parent class name parenthis () curly bracs{}
        *
        * can only access parent class variable and function
        * anonmus class method are always overriden from its parent class , this is called late bindnig
        * */
        //anonmous class is always child class
        //parent class refernce variale can refer to child class
        //anonomous class has  Parent class name and paranthesis ()

        public void sayHello(){
            System.out.println("overriden hello");
        } //this method is overriden from parent class Greeting

        public void childhello(){
            System.out.println("child hello");
            //this is child method and not present in parent class gretting , this will not work

        }
        //to run any method on child class they must be overriden from parent class

    };
}

public class Example {
    //example is outer class
    public static void main(String[] args) {
        India i1 = new India(); // making object and refernce variable of class India to access the inner anonomus class
        i1.g.sayHello(); //accessing method in anonmous class method present in g which is acrually overriding method of parent Greeting
    }
}
