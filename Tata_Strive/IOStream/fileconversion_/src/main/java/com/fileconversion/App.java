package com.fileconversion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter extension (pdf not supported): ");
        String line = sc.nextLine();

        sc.close();

        try (FileWriter fileWriter = new FileWriter("b." + line);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                FileReader fileReader = new FileReader("a.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);) {          

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("File converted successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}