package introobjetos;

import java.awt.font.LineMetrics;
import java.util.Scanner;

//Superclase superviviente
class Superviviente {
    protected String nombre;
    protected int edad;
    protected int resistencia;

    //Constructor
    public Superviviente (String nombre, int edad, int resistencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.resistencia = resistencia;
    }

    //Constructor por defecto
    public Superviviente () {
        this.nombre = "desconocido";
        this.edad = 0;
        this.resistencia = 0;
    }

    // Getters y Setters
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getResistencia() { return resistencia; }

    public void setResistencia(int resistencia) { this.resistencia = resistencia; }

    //Devolver mensaje
    public void mostrarInformacion() {System.out.println("nombre= " + nombre + ", edad= " + edad + ", resistencia= " + resistencia + ".");}

}



//Subclase 1 que hereda de Superviviente
class Joel extends Superviviente {
    private String arma;

    //Constructor
    public Joel (String nombre, int edad, int resistencia) {
        super(nombre, edad, resistencia);
        this.arma = arma;
    }

    //Constructor por defecto
    public Joel () {
        super();
        this.arma = "Sin asignar";
    }

    //getters y setters joel
    public String getArma () { return  arma; }
    public void setArma ( String arma ) { this.arma = arma; }

    //Mensaje de salida
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("arma = " + arma);
    }

}



//Subclase 2 que hereda de Superviviente
class Ellie extends Superviviente {
    private boolean inmunidad;

    //Constructor
    public Ellie (String nombre, int edad, int resistencia) {
        super (nombre, edad, resistencia);
        this.inmunidad = inmunidad;
    }

    //Constructor por defecto
    public Ellie () {
        super ();
        this.inmunidad = false;
    }

    //Getters y setters ellie
    public boolean getInmunidad() { return inmunidad; }
    public void  setInmunidad(boolean inmunidad) { this.inmunidad = inmunidad; }

    //Mensaje de salida
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Inmunidad= " + inmunidad);
    }
}



//METODO MAINNN
public class Main_lastofus {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        String personaje = "";

        System.out.println("Elige un personaje");
        personaje = teclado.nextLine();

        if (personaje == "JOEL") {

            System.out.println("Has escogido a Joel como personaje");
            Estudiante personaje1 = new Estudiante();
            personaje1.setNombre("Joel");
            System.out.println("Introduce tu edad");
            personaje1.setEdad(teclado.nextInt());



        } if (personaje == "ELLIE") {

            System.out.println("Has escogido a ellie como personaje");


        }


    teclado.close();
    }

}
