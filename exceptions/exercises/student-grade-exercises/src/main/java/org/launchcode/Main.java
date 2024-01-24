package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> studentFile : studentFiles.entrySet()) {
            System.out.println("Student name: " + studentFile.getKey());
            System.out.println(CheckFileExtension(studentFile.getValue()));
        }
    }

    public static int Divide(int x, int y) {
        // Write code here!
        try {
            return x/y;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }

    }

    public static int CheckFileExtension(String fileName)
    {
        int score = 0;
        try {
            if(fileName == null || fileName.isEmpty()) {
                throw new IllegalArgumentException("Filename cannot be null");
            }
            if (fileName.endsWith(".java")){
                score = 1;
            } else {
                score = 0;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            score = -1;
        }
        return score;
    }
}