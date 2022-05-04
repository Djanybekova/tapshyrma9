package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(name(1, 300));

    }

    static int name(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 3) == 0 && (i % 4) == 0 && (i % 5) == 0) {
                c = c + i;
            }
        }
        return c;
    }
}
