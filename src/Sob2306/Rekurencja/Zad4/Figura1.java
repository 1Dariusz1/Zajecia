package Sob2306.Rekurencja.Zad4;

public class Figura1 {
    static void fig1 () {
        String a = "*";

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {
                if (j <= i) {
                    System.out.print(a);

                }

            }
            System.out.println();
        }

    }
}

// rysuje trojkat