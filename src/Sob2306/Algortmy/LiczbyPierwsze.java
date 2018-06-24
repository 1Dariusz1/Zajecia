package Sob2306.Algortmy;

public class LiczbyPierwsze {
    public static void main(String[] args) {
        for(int i = 1; i< 300;i++)

        {
            int podzielnik = 2;
            boolean liczbaPierwsza = true;
            if (i > 3) {
                while (podzielnik < i) {
                    if (i % podzielnik == 0) {
                        liczbaPierwsza = false;
                        break;
                    }
                    podzielnik++;
                }
            }
            if (liczbaPierwsza) {
                System.out.println("Liczba pierwsza: " + i);
            }
        }
    }
}

// program wypisuje liczby pierwsze od 1 do 300