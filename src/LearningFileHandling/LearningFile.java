package LearningFileHandling;
import java.io.File;
import java.io.IOException;

public class LearningFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/Raj.txt");
        File f2 = new File("D:/Shimoli.txt"); //this is a IOexception what if path dont exist
        f2.createNewFile();
        System.out.println(f1.canRead());
        System.out.println(f2.length());
        f2.delete();
        System.out.println(f1.exists());


    }
}
