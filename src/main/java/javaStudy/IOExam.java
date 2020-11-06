package javaStudy;

import java.io.*;

public class IOExam {

    public static void main(String[] args) {
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        ){
            out.writeInt(100);
            out.writeBoolean(false);
            out.writeDouble(50.5);
            out.writeDouble(100.5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
