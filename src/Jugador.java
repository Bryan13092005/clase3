import java.util.Scanner;
public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numeroJugador;
    public Jugador(String nombre,String posicion,int edad, int numeroJugador){
        this.nombre=nombre;
        this.posicion=posicion;
        this.edad=edad;
        this.numeroJugador=numeroJugador;
    }
    void imprimir(){
        System.out.println("Nombre: "+nombre+"\nPosición: "+posicion+"\nEdad. "+edad+"\nNúmero del jugador: "+numeroJugador);
    }

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.print("Ingrese el nombre del primer jugador: ");
        String nombre1=datos.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad1=datos.nextInt();
        datos.nextLine();
        Jugador p1=new Jugador(nombre1,"Centro",edad1,15);
        p1.imprimir();
        System.out.print("Ingrese el nombre del segundo jugador: ");
        String nombre2=datos.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad2=datos.nextInt();
        datos.nextLine();
        Jugador p2=new Jugador(nombre2,"Arquero",edad2,1);
        p2.imprimir();
        System.out.print("Ingrese el nombre del tercer jugador: ");
        String nombre3=datos.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad3=datos.nextInt();
        datos.nextLine();
        Jugador p3=new Jugador(nombre3,"Delantero",edad3,10);
        p3.imprimir();
    }
}
