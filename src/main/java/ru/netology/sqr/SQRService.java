package ru.netology.sqr;

public class SQRService {
    public int calculate(int from, int to) {
        int meter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= from) {
                if (i * i <= to) {
                    meter = meter + 1;
                }
                return i;
            }
        }
        System.out.println(meter);
        return meter;
    }
}
