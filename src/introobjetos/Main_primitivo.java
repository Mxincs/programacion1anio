// ----- Clases -----

class Automovil {
    protected String nBastidor;
    protected int numRuedas;
    protected int nFaros;
    protected double diametroRueda;
    protected Combustible combustible;

    protected String combustible;
    protected String modelo;
    protected String marca;
    protected double peso;
    protected double velMax;

    public Automovil(String nBastidor, int numRuedas, int nFaros, double diametroRueda, Combustible combustible) {
        this.nBastidor = nBastidor;
        this.numRuedas = numRuedas;
        this.nFaros = nFaros;
        this.diametroRueda = diametroRueda;
        this.combustible = combustible;
    }
}

class Coche extends Automovil {
    protected int numPuertas;
    protected String color;
    protected boolean automatico;
    protected String chasis;
    protected Motor motor;

    public Coche(String nBastidor, int numRuedas, int nFaros, double diametroRueda,
                 Combustible combustible, int numPuertas, String color,
                 boolean automatico, String chasis, Motor motor) {
        super(nBastidor, numRuedas, nFaros, diametroRueda, combustible);
        this.numPuertas = numPuertas;
        this.color = color;
        this.automatico = automatico;
        this.chasis = chasis;
        this.motor = motor;
    }

    public double obtenerConsumoMedio() {
        return 7.5;
    }

    public Motor getMotor() {
        return motor;
    }
}

class Moto extends Automovil {
    protected int cilindrada;
    protected boolean carretera;

    public Moto(String nBastidor, int numRuedas, int nFaros, double diametroRueda,
                Combustible combustible, int cilindrada, boolean carretera) {
        super(nBastidor, numRuedas, nFaros, diametroRueda, combustible);
        this.cilindrada = cilindrada;
        this.carretera = carretera;
    }

    public boolean getCarretera() {
        return carretera;
    }

    public boolean esDeportiva() {
        return cilindrada > 600;
    }

    public boolean puedeCircular() {
        return carretera;
    }
}

class Motor {
    protected int numeroMotor;
    protected int caballos;
    protected String pais;
    protected double precio;
    protected String descripcion;

    public Motor(int numeroMotor, int caballos, String pais, double precio, String descripcion) {
        this.numeroMotor = numeroMotor;
        this.caballos = caballos;
        this.pais = pais;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public boolean encender() {
        return true;
    }
}

class Conductor {
    protected String dni;
    protected String nombre;
    protected int edad;
    protected String nif;
    protected String carnet;

    public Conductor(String dni, String nombre, int edad, String nif, String carnet) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nif = nif;
        this.carnet = carnet;
    }

    public int calcularMayoríaEdad() {
        return edad >= 18 ? 1 : 0;
    }
}

// ----- Clase Main al final -----

public class Main_primitivo {
    public static void main(String[] args) {
        Combustible combustible = new Combustible("Diesel", "Toyota", 1200, 180);
        Motor motor = new Motor(1234, 150, "Alemania", 3000.0, "Motor de alto rendimiento");

        Coche coche = new Coche("ABC123", 4, 2, 17.5, combustible, 5, "Rojo", true, "Monocasco", motor);
        Moto moto = new Moto("XYZ987", 2, 1, 14.0, combustible, 650, true);

        Conductor conductor = new Conductor("12345678A", "Juan Pérez", 25, "NIF1234", "B");

        System.out.println("¿El coche está encendido? " + coche.getMotor().encender());
        System.out.println("¿La moto es deportiva? " + moto.esDeportiva());
        System.out.println("¿El conductor es mayor de edad? " + (conductor.calcularMayoríaEdad() == 1 ? "Sí" : "No"));
    }
}