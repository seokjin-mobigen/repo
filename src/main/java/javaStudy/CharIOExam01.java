package javaStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = new String();
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(line);
    }
}
