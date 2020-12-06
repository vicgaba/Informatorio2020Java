import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){
        int num = 1;
        Scanner scan = new Scanner(System.in);
        while (num == 1){
            System.out.println("Ingrese un número: ");
            num = scan.nextInt();
            System.out.println("El número ingresado es " + num + ", si desea continuar ingrese 1, con otro número saldrá del sistema.");
            num = scan.nextInt();
        }
        scan.close();
    }
    
}
