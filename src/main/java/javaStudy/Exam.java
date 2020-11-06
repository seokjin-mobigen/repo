package javaStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/main/java/javaStudy/Exam.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1;
            byte[] buffer = new byte[512];

            while ((readCount = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, readCount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
