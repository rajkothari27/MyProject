package LearningFileHandling;
import javafx.scene.transform.Scale;

import java.io.*;
import java.util.Scanner;

public class LearningBufferedWritter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("./Shimoli.txt",true));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lines you want to write using buffer:");
        String name = sc.nextLine();
        bf.write(name);
        bf.close();
        BufferedReader br = new BufferedReader(new FileReader("./Shimoli.txt"));
        int ch;
        while((ch=br.read())!=-1){
            System.out.print((char)ch);
        }
       String q = br.readLine();
        System.out.println(q);
        br.close();
    }
}
