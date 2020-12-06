import java.util.Scanner;

public class Ejercicio3{
    
    public static void main(String[] args){

        System.out.println("Ingrese una calificación: ");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();
        calificarEstudiante(nota);     
    }

    public static void calificarEstudiante(int nota){
        if (nota > 92) {
            System.out.println("Excelente");
        } else if (nota > 84) {
            System.out.println("Sobresaliente");
        } else if (nota > 74) {
            System.out.println("Distinguido");
        } else if (nota > 59) {
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado");
        } 
    }

}