package Main;

import Ejercicios.Coche;
import Ejercicios.Parte1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("|-----------------------------| \n Parte 1 del Ejercicio: \n Introduzca el primer numero: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("\nIntroduzca el segundo numero: ");
        int y = sc.nextInt();
        System.out.print("\nIntroduzca el tercer numero: ");
        int z = sc.nextInt();
        System.out.println("El resultado de la suma de los tres numeros es: " + Parte1.sumar(x, y, z) + "\n");
        System.out.println("|-----------------------------|");
        System.out.println("|-----------------------------| \n Parte 2 del Ejercicio: ");
        Coche c = new Coche();
        System.out.println("Puertas que posee el coche: " + c.getPuertas());
        c.aniadirPuerta();
        System.out.println("Puertas que posee el coche después de la utilización de la función: " + c.getPuertas());

    }
}
