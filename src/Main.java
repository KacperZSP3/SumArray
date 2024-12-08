import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie rozmiaru tablicy
        System.out.print("Podaj rozmiar tablicy (n): ");
        int n = scanner.nextInt();

        // Utworzenie tablicy
        int[] tablica = new int[n];

        // Wczytanie liczb do tablicy
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        // Obliczenie sumy liczb
        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }

        // Wyświetlenie wyniku
        System.out.println("Suma: " + suma);

        scanner.close();
    }
}