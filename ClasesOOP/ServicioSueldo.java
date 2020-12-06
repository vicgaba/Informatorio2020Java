public class ServicioSueldo {

    public static void main(String[] args) {

        Empleado emp1 = new EmpleadoEfectivo(1,"Victor", "Gabardini", 50000, 20);
        Empleado emp2 = new EmpleadoEfectivo(2,"Julieta", "Gabardini", 190000, 4);
        Empleado emp3 = new EmpleadoJornada(3, "Mara", "Meyer", 100, 500);
        System.out.println(emp1.calcularSueldo());
        System.out.println(emp2.calcularSueldo());
        System.out.println(emp3.calcularSueldo());
    }
    
}
