package level1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Debe ingresar tres números enteros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("El primer número ingresado es: " + a);
        System.out.println("El segundo número ingresado es: " + b);
        System.out.println("El tercer número ingresado es: " + c);
        
    }    
}
