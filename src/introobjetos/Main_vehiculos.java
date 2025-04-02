package introobjetos;

//Creacion de la superclase Vehiculo
class Vehiculo {

    //Creacion de atributos
    protected String marca;
    protected String modelo;
    protected int anio;

    // Constructor por defecto de vehiculos para cuando NO SE INTRODUZCAN OBJETOS
    public Vehiculo () {
        this.marca = "Desconocido";
        this.modelo = "Desconocido";
        this.anio = 0;
    }

    // Constructor de vehiculos para cuando SE INTRODUZCAN OBJETOS
    public Vehiculo (String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    //Creacion de getters y setters marca
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    //Creacion getters y setters modelo
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    //Creacion de getters y setters año
    public int getAnio() { return anio;}
    public void setAnio(int anio) { this.anio = anio; }

    //Creacion de MOSTRARINFORMACION para mostrar los parametros por pantalla
    public void mostrarInformacion()
    {
        System.out.println("MARCA: " + marca + ", MODELO: " + modelo + ", AÑO: " + anio);
    }

}



//subclase Coche que hereda de la superclase Vehiculo
class Coche extends Vehiculo {

    //Creamos la variable para el numero de puertas
    private int numPuertas;

    //Constructor por defecto de Coche
    public Coche () {
        super(); // Llama al constructor por defecto de Vehiculo
        this.numPuertas = 0;
    }

    //Constructor de Coche
    public Coche (String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio); // Llamada al constructor de la superclase Vehiculo
        this.numPuertas = numPuertas;
    }

    //Creacion de getters  y setters de la subclase Coche
    public int getNumPuertas() { return numPuertas; }
    public void setNumPuertas(int numPuertas) { this.numPuertas = numPuertas; }

    //metodo para mostrar información de la subclase Coche
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("NUMERO PUERTAS: " + numPuertas);
    }

}



//subclase Moto que hereda de la superclase Vehiculo
class Moto extends Vehiculo {

    //Creamos la variable para el cilindraje de las motos
    private int cilindrada;

    public Moto () {
        super(); //Llama al constructor por defecto de Vehiculo
        this.cilindrada = 0;
    }

    //Constructor de Moto
    public Moto (String marca, String modelo, int anio, int cilindrada) {
        super (marca, modelo, anio); //Llama al constructor de la superclase Vehiculo
        this.cilindrada = cilindrada;
    }

    //Creacion de getters y setters de la subclase Moto
    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    //metodo para mostrar información de la subclase Moto
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("CILINDRAJE: " + cilindrada);
    }

}



public class Main_vehiculos {

    public static void main(String[] args) {

        // Uso del constructor con parámetros
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 4);
        coche1.mostrarInformacion();
        Moto moto1 = new Moto("Yamaha", "R6", 2021, 600);
        moto1.mostrarInformacion();

        //Uso de constructor por defecto
        Coche coche2 = new Coche();
        coche2.mostrarInformacion();
        Moto moto2 = new Moto();
        moto2.mostrarInformacion();

        //Uso de los setters
        coche2.setMarca("Mazda");
        coche2.setModelo("M1");
        coche2.setAnio(2002);
        coche2.setNumPuertas(5);
        moto2.setMarca("Zuzuki");
        moto2.setModelo("japan");
        moto2.setAnio(2025);
        moto2.setCilindrada(800);

        //Mostramos el contenido de los atributos
        coche2.mostrarInformacion();
        moto2.mostrarInformacion();

    }
}
