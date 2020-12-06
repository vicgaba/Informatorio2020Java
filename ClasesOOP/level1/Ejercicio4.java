import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args){
        int dia = 1;
        Scanner scan = new Scanner(System.in);

        while (dia != 8){
            System.out.println("Ingrese un número entero del 1 al 7");
            dia = scan.nextInt();
            mostrarDia(dia);
            System.out.println("Si desea salir del programa inserte el número 8");
            dia = scan.nextInt();
        }
        scan.close();
       
    }

    public static void mostrarDia(int dia){

        switch (dia) {
            case 1: 
                System.out.println("Domigno");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5: 
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

    }
}