package com.geek.utils;

import java.io.DataInputStream;
import java.io.IOException;

// Класс, обеспечивающий вывод строк текста, а также ввод чисел
// целых типов int и long и вещественных float и double.
public class InputHelper {

    private static final DataInputStream in =
            new DataInputStream(System.in);
    // Максимальная длина строки
    private static final int MAXLEN = 255;

    private static String inputString() throws IOException {
        byte buf[] = new byte[MAXLEN];
        int n = in.read(buf);
        return new String(buf, 0, n - 1);
    }

    // Методы вывода строки
    public static void print(String txt) {
        System.out.print(txt);
    }

    public static void println(String txt) {
        print(txt + "\n");
    }


    // Методы ввода чисел типов int, long, float, double
    public static int inputInt() throws IOException,
            NumberFormatException {
        return Integer.valueOf(inputString()).intValue();
    }

    public static int inputInt(String prompt) throws IOException,
            NumberFormatException {
        print(prompt);
        return inputInt();
    }

    public static long inputLong() throws IOException,
            NumberFormatException {
        return Long.valueOf(inputString()).longValue();
    }

    public static long inputLong(String prompt) throws IOException,
            NumberFormatException {
        print(prompt);
        return inputLong();
    }

    public static float inputFloat() throws IOException,
            NumberFormatException {
        return Float.valueOf(inputString()).floatValue();
    }

    public static float inputFloat(String prompt) throws IOException,
            NumberFormatException {
        print(prompt);
        return inputFloat();
    }

    public static double inputDouble() throws IOException,
            NumberFormatException {
        return Double.valueOf(inputString()).doubleValue();
    }

    public static double inputDouble(String prompt)
            throws IOException, NumberFormatException {
        print(prompt);
        return inputDouble();
    }

    // Методы ввода строки, рассматриваемой как массив символов.
    public static char[] inputChars() throws IOException {
        return (inputString()).toCharArray();
    }

    public static char[] inputChars(String prompt)
            throws IOException {
        print(prompt);
        return (inputString()).toCharArray();
    }
}
