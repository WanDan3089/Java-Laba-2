package org.example;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String fizzbuzz(int n) {
        if (n % 5 == 0 && n % 7 == 0) {
            return "fizzbuzz";
        } else if (n % 5 == 0) {
            return "fizz";
        } else if (n % 7 == 0) {
            return "buzz";
        } else {
            return Integer.toString(n);
        }
    }

    public static String reverseString() {
        String str = "make install";  // Переменная создаётся внутри метода
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString(); // Возвращаем строку вместо вывода на консоль
    }

    public static class Bell //Создание класса bell
    {
        public void sound(String name){
            String result_sound;
            result_sound = name;
            System.out.println(result_sound);
        }
    }

    //
    public static class OddEvenSeparator {

        private static int even;
        private static int odd;

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int a = Math.abs(Integer.parseInt(reader.readLine())), i = String.valueOf(a).length(); i-- > 0; a /= 10) {
                if (a % 2 == 0)
                    even++;
                else
                    odd++;
            }
            System.out.println("Even: " + even + " Odd: " + odd);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(fizzbuzz(i));
        }

        Bell bell = new Bell();
        bell.sound("ding-dong");

    }
}