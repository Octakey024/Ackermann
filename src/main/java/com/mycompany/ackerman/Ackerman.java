package com.mycompany.ackerman;

import java.util.Scanner;

public class Ackerman {

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuáles son tus números para hacer tu operación Ackerman?");
        System.out.print("Primer número es: ");
        int m = leer.nextInt();
        System.out.print("Tu segundo número es: ");
        int n = leer.nextInt();
        int result = ack(m, n);
        System.out.println("El resultado de Ackermann para m = " + m + " y n = " + n + " es: " + result);
    }
}
