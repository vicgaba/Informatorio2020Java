public abstract class Empleado{

    private int dni;
    private String nombre;
    private String apellido;

    public Empleado(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract int calcularSueldo();
    
    @Override
    public String toString() {
        return String.format("%s %s con DNI %s", this.nombre, this.apellido, this.dni);
    }
}