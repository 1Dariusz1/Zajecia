package Sob2306.Rekurencja.Zad2;

import java.util.Scanner;

import static Sob2306.Rekurencja.Zad2.RekuPrezZad2.silniaRekurencyjna;

public class RekuPrezZad2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int number = scanner.nextInt();

        silniaRekurencyjna(number);
    }

}
