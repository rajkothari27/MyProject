package LearningWrapper;

public class LearningWrapperClass {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf("123");//this is a number int type but it is string form
        // value of function will create a object of Integer class  and store value as int , it will convert string into int

        Double aDouble = Double.valueOf("3.14");//this is a number Double type but it is string form
        // value of function will create a object of Double class

        System.out.println(integer);
        System.out.println(aDouble);

        int i = Integer.parseInt("123");//this will convert string value and return int value
        Double.parseDouble("13.45");//this will convert string value and return double value

        //instance method needs object
        integer.intValue(); //this will return int value of integer class and want to transfer it to prmitive

    }

}
