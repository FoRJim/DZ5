package ru.netology.sqr.DZ5.services;

public class SQRService {
    public int sqrtCeil(int number1, int number2) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= number1) && (i * i <= number2)) {
                count++;
            }
        }
        return count;
    }
}
