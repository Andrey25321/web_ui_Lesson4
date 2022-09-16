package com.geek.utils;

import com.geek.lesson4.Triangle;
import com.geek.lesson4.exceptions.NotTriangleException;
import org.asynchttpclient.util.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.testng.annotations.Test;

import java.lang.reflect.Executable;

public class TriangleTest {
    @Test
    void testIncorrectTriangle_1() throws NotTriangleException {
        Assertions.assertThrows(NotTriangleException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Triangle triangle = new Triangle(1, 2, 3);
            }
        });
    }

    @Test
    void testCorrectArea() throws NotTriangleException {
        Triangle triangle = new Triangle(4, 5, 3);
        Assertions.assertEquals(6, triangle.getArea());
    }

    @Test
    void testIncorrectArea() throws NotTriangleException {
        Triangle triangle = new Triangle(4, 5, 2);
        Assertions.assertNotEquals(6, triangle.getArea());
    }


}
