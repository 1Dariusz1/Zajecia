package Sob2306.Rekurencja.Zad3;

import static Sob2306.Rekurencja.Zad3.Zad3_1.alg2;
import static Sob2306.Rekurencja.Zad3.Zad3_2.alg3;

public class Zad3Main {
    public static void main(String[] args) {
        alg1(10);
        System.out.println();
        alg2(10);
        System.out.println();
        alg3(10);

    }

    static void alg1(int n) {
        for (int i = 1; i < n*2; i+=2) {
//            System.out.println(i);
            System.out.print(i + ", ");

        }
    }

}

// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19