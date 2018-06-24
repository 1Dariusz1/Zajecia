package Sob2306.Rekurencja.Zad3;

import jdk.internal.dynalink.beans.StaticClass;

public class Zad3_2 {
    static void alg3 (int b) {
//        int number = 2;

        boolean direction = true; // flaga

        int result = 2;

        for (int i = 0; i < b; i++) {

            System.out.print(result + ", ");

            if (direction) {
                result +=2;
            } else {
                result -=2;
            }

            if (result == 8 || result == 2) {
                direction = !direction;
            }

        }
    }
}

// 2, 4, 6, 8, 6, 4, 2, 4, 6, 8