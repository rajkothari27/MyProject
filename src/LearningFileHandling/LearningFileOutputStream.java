package LearningFileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class LearningFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("./shimoli.txt",true);
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the data you want to type in file : ");
        String name = sc.nextLine();
        char ch [] = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            fout.write(ch[i]);
        }
        fout.close();


    }
}
