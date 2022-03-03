package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String bolshieBukvy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String malBukvy = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        try {
            FileWriter writer = new FileWriter("alphabet.txt");
            for (int i = 0; i < bolshieBukvy.length(); i++) {
                writer.write("\n" + bolshieBukvy.charAt(i) + "" + malBukvy.charAt(i));

            }

            for (int i = 0; i < num.length(); i++) {
                writer.write("\n" + num.charAt(i));
            }
            writer.close();
        } catch (Exception a) {
            a.getStackTrace();
        }
        FileReader bukvy = new FileReader("alphabet.txt");
        Scanner scanner = new Scanner(bukvy);
        int i = 0;
        while (scanner.hasNextLine()) {
            System.out.println(i + ":" + " " + scanner.nextLine());
            i++;
        }
        bukvy.close();
    }
}
