package com.geekbrains.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void triangleTest() throws Exception {
        Assertions.assertEquals(Triangle.calculateArea(3, 4, 5), 6);

    }

    @Test
    void triangleNegativeTest()  {
        Assertions.assertThrows(Exception.class, () -> Triangle.calculateArea(3, -4, 5));

    }
}
