package Sob2306.Rekurencja.Zad3;

public class Zad3_1 {
    static void alg2(int a) {
        int number = -1;
        for (int i = 0; i < a; i++) {
            System.out.print(number + ", ");
            number = number * 2+3;
        }
    }

}

// -1, 1, 5, 13, 29, 61, 125, 253, 509, 1021