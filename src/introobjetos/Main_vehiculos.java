package introobjetos;

//Superclase Vehiculo
class Vehiculo {
    private String marca;
    private int year;

    //Constructor vehiculo
    public Vehiculo (String marca, int year) {
        this.marca = marca;
        this.year = year;
    }

    //Metodos
    public void arrancar () {
        System.out.println("El vehiculo " + marca + " ha arrancado.");
    }

    public void detener () {
        System.out.println("El vehiculo " + marca + " se ha detenido.");
    }

    //Getters
    public String getMarca () {
        return marca;
    }

    public int getYear () {
        return year;
    }
}

//Clase Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    private int numPuertas;

    //Constructor coche
    public Coche(String marca, int year, int numPuertas) {
        super(marca, year); //Llama al constructor de la superclase vehiculo
        this.numPuertas = numPuertas;
    }

    //Metodo adicional
    public void abrirPuertas () {
        System.out.println("Abriendo las " + numPuertas + " puertas del coche.");
    }
}

//Superclase persona
class Persona {
    private String nombre;
    private Coche coche;

    //Constructor Persona
    public Persona (String nombre, Coche coche) {
        this.nombre = nombre;
        this.coche = coche; //Relacion de agregacion
    }

    //Metodos
    public void conducir () {
        System.out.println(nombre + " esta conduciendo el coche");
        coche.arrancar();
    }
}

//Clase main
public class Main_vehiculos {
    public static void main (String[] args) {
        //Creacion de objetos
        Coche miCoche = new Coche("toyota", 2021, 4);
        Persona persona1 = new Persona("juan", miCoche);

        //Probar la interaccion
        persona1.conducir();
        miCoche.abrirPuertas();
    }
}
