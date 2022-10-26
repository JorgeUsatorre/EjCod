
package boletin2_3;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("valor actual del dolar:");
        double c = scan.nextDouble();
        System.out.println("Cantidad de eutos a cambiar:");
        double e = scan.nextDouble();
        double d = c * e;
        System.out.println("Sus "+ e + "€ equivalen a " + d + "$.");
    }

}