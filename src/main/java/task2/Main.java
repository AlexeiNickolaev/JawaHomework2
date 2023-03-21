package task2;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String testString = generateTestString();
        System.out.println(testString);
        writeTestStringToFile("test.txt");
    }

    public static String generateTestString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(": TEST\n");
        }
        return sb.toString();
    }

    public static void writeTestStringToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            String testString = generateTestString();
            writer.write(testString);
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }
    }
}





