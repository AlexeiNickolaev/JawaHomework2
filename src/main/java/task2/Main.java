package task2;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String testString = repeatString("TEST", 100);
        System.out.println(testString);
        writeToFile(testString, "test.txt");
    }

    private static String repeatString(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i+1).append(". ").append(s).append("\n");
        }
        return sb.toString();
    }

    private static void writeToFile(String s, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(s);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


