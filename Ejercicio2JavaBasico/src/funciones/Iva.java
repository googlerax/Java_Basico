package funciones;

import java.util.Scanner;

public class Iva {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese importe en pesos");
        float iva = 1.21f;
        int ingreso = scanner.nextInt();

        float IVA = ingreso * iva;

        System.out.println("El precio con iva incluido es: " + IVA + " pesos");


    }
}
