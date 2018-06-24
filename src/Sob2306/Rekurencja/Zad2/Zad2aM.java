//http://kodatnik.blogspot.com/2009/09/silnia-rekurencyjnie.html
package Sob2306.Rekurencja.Zad2;

import java.util.Scanner;

public class Zad2aM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Podaj liczbę: " );

        int liczba = scanner.nextInt();

        System.out.println(liczba + "! = " + Zad2a.silnia(liczba));
    }
}

