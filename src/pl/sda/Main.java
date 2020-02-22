package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String imie = input.nextLine();
        System.out.println("Podaj swoje nazwisko");
        String nazwisko = input.nextLine();
        System.out.println("Podaj swój wiek");
        String wiek = input.nextLine();
        System.out.println();
        System.out.println("Twoje imie to " + imie + ", nazwisko to " + nazwisko + ", wiek to " + wiek);

    }
}
