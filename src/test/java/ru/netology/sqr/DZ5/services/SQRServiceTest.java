package ru.netology.sqr.DZ5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void NumberOfSquares1() {
        SQRService service = new SQRService();
        int expected = 11;
        int actual = service.sqrtCeil(100, 400);
        Assertions.assertEquals(expected, actual);
    }
}

