package Sob2306.Rekurencja.Zad2;

public class Zad2a {
    public static int silnia(int wartosc) {
        if(wartosc == 0) return 1;
        else return wartosc * silnia(wartosc - 1);

    }

}



