package com.geek.lesson4;

import com.geek.lesson4.exceptions.NotTriangleException;
import com.geek.utils.InputHelper;

import java.io.IOException;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws NotTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!isTriangle()) {
            throw new NotTriangleException("Треугольник задан не корректно");
        }
    }

    private boolean isTriangle() {
        return a < b + c && b < a + c && c < b + a;
    }

    public double getArea() {
        double p = ((double)(a + b + c))/2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) throws IOException, NotTriangleException {
        int a = InputHelper.inputInt("input a:");
        int b = InputHelper.inputInt("input b:");
        int c = InputHelper.inputInt("input c:");
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Площадь треугольника: " + triangle.getArea());
    }
}

