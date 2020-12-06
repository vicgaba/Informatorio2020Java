package level1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        System.out.println("Debe ingresar tres números enteros: ");

        obtenerNumeros();

    }    
    public static void obtenerNumeros(){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        imprimirNumeros(a, b, c);
    }

    public static void imprimirNumeros(int a, int b, int c){
        System.out.println("El primer número ingresado es: " + a);
        System.out.println("El segundo número ingresado es: " + b);
        System.out.println("El tercer número ingresado es: " + c);

    }

}
