package LearningGenerics;
//generic method example
public class Example {
    public <E> void printArray(E [] s){
        //here before the return  type you need to put place holder with angular  bracket
        // and then where you write datatype you need to write that place holder again
        //here this place holder will be able to take diffrent arugment of array types
        //we are running three type of arrays int, string , float and this single method
        // will take all the argument using that generic place holder, this <E> only refer to class type not primitive type(int,float etc)
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        String countries[] = new String[]{
                "India","aus","usa"
        };
        Integer nums [] = {1,2,99,75};
        Float f1 [] = {1.254445f,2.9991156f};
        e1.printArray(countries);
        e1.printArray(nums);
        e1.printArray(f1);
    }
}
