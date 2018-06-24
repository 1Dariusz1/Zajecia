package Sob2306.Rekurencja.Zad2;

public class RekuPrezZad2 {
  /*  int sum(int n) {
        if (n==0 || n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }

    }*/

    public static int silniaRekurencyjna (int n) {
        if (n == 0)
            return 1;
                else {
            return (n*silniaRekurencyjna(n-1));
        }
    }

}
