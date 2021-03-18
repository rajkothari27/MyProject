package LearningCollections;
import java.util.*;
public class LearningArrays {
    public static void main(String[] args) {
        //how to declare arrays
        int a [] = new int[5];
        int b [] = new int  [] {10,20,30,50};
        int c [] = {10,5,6,9,7,11};
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + "");
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
        //sorting using Arrays class
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println("");
            System.out.println(b[i]);
        }


    }
}
class ArraySortWithLoop{
    public static void main(String[] args) {
        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");
//sorting logic
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }
}

