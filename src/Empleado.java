import java.util.Scanner;
public class Empleado {
    String nombre;
    String correo;
    int edad;
    int sueldo;

    public Empleado(String nombre,String correo,int edad,int sueldo){
        this.nombre=nombre;
        this.correo=correo;
        this.edad=edad;
        this.sueldo=sueldo;
    }

    public static Empleado crearEmpleados(Scanner datos){
        System.out.print("Ingresa el nombre: ");
        String nombre=datos.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad=datos.nextInt();
        datos.nextLine();
        System.out.print("Ingresa el sueldo: ");
        int sueldo=datos.nextInt();
        datos.nextLine();
        String correo=nombre+"@empresa.com";
        System.out.println("---------------------------");
        return new Empleado(nombre,correo,edad,sueldo);
    }

    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " +correo);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: $"+sueldo);
        System.out.println("---------------------------");
    }

    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        Empleado nuevo1=crearEmpleados(datos);
        Empleado nuevo2=crearEmpleados(datos);
        Empleado nuevo3=crearEmpleados(datos);

        System.out.println("\nEMPLEADOS:\n");
        nuevo1.imprimir();
        nuevo2.imprimir();
        nuevo3.imprimir();

    }
}
