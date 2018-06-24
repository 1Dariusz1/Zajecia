package Sob2306.Algortmy;

public class Zad1_3 {

}



/*
import java.lang.*;
import java.util.Scanner;

public class Zad1_3 {
    public static void main(String[] args) {
        System.out.println("Podaj przedzial x1<x2");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        Pierwsza c = new Pierwsza();
        for (int i = x1; i <= x2; i++) {
            if (c.licz(i)) {
                System.out.println(i);
            }
        }
    }
}*/

/*import java.io.Console;

public class Zad1_3 {
    public static void main(String[] args) {
        int liczbaDzielnikow= 1;
        int dzielnik= 2;

        Console wierszPolecen= System.console();
        String tekst= wierszPolecen.readLine("Podaj liczbe naturalna");
        double liczba=Double.parseDouble(tekst);
        if (liczba==1||liczba==0){
            System.out.println("Nie jest liczba pierwsza");
        }else{

            for (dzielnik <= Math.sqrt(liczba)); {
                if(liczba % dzielnik==0){
                    liczbaDzielnikow++;
                }
            }
        }
    }
}*/
/*

import java.io.Console;
public class Zadanie16 {
    public static void main(String[] args){
        Console wierszPolecen= System.console();
        String tekst= wierszPolecen.readLine("Podaj liczbe naturalna");
        double liczba=Double.parseDouble(tekst);
        if (liczba==1||liczba==0){
            System.out.println("Nie jest liczba pierwsza");
        }else{
            int liczbaDzielnikow= 1;
            int dzielnik= 2;
            for (dzielnik<=Math.sqrt(liczba)){
                if(liczba%dzielnik==0){
                    liczbaDzielnikow++;
                }
            }
        }
    }
}
*/
