package task1;

// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).


public class Palindrome{
    public static void main(String[] args) {
        String str = "level";

        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println(str + " является палиндромом");
        } else {
            System.out.println(str + " не является палиндромом");
        }
    }

    public static boolean isPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
}
