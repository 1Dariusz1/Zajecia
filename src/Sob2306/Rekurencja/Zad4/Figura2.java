package Sob2306.Rekurencja.Zad4;

public class Figura2 {
    static void fig2  (){
        String a = "*";
        String b = " ";
        int n = 5;

        for (int i = 1; i <= n; i++) {
//            System.out.println(b);
            for (int j = 1; j <= n; j++) {
//                if (i == j || (i + j) == n + 1) {
                if (i > j || (i + j) == n + 1) {

                    System.out.print(a);
                } else {

                    System.out.println(b);
                }

            }
            System.out.println();
        }
    }
}

// rysuje znak \