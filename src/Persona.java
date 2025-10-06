public class Persona{
    int cedula;
    String nombre;
    int edad;
    String correo;
    public Persona(int cedula,String nombre,int edad, String correo){
        this.cedula=cedula;
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
    }

    void imprimir(){
        System.out.println("Bienvenido"+" "+nombre+" "+cedula+" "+edad+" "+correo);
    }

    public static void main(String[] args) {
        Persona p1=new Persona(1753655172,"Bryan Salvador",20,"bryanrsalvadormartinez@gmail.com");
        p1.imprimir();
        Persona p2=new Persona(1711684132,"Ximena",46,"ximena@gmail.com");
        p2.imprimir();

    }
}

