import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args){

        System.out.println("Ingrese el número para ver su tabla de multiplicación");
        Scanner scan = new Scanner(System.in);
        int mult = scan.nextInt();
        scan.close();
        
        for (int i = 1; i <= 10; i ++){
            System.out.println(mult + " * "+ i + " = " + mult * i);
        }
    }
    
}
