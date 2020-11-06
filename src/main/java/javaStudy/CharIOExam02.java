package javaStudy;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.*;

public class CharIOExam02 {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/javaStudy/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            while((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
