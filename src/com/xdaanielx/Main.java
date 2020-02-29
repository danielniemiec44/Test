package com.xdaanielx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ta czescia kodu zajmuje sie Daniel

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe a: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj liczbe b: ");
        double b = scanner.nextDouble();
        System.out.println("Suma liczb a i b wynosi: " + dodaj(a,b));


    }
}
