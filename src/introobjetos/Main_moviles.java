package introobjetos;

import java.util.Random;

// Clase Smartphone
class Smartphone {
    private String marca;
    private String modelo;
    private int almacenamiento;
    private double precio;
    private boolean encendido;

    // Constructor con todos los atributos
    public Smartphone(String marca, String modelo, int almacenamiento, double precio, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.encendido = encendido;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    // Método para encender el smartphone
    public String encender() {
        if (!encendido) {
            encendido = true;
            return "Smartphone encendido";
        } else {
            return "El smartphone ya está encendido";
        }
    }

    // Método para apagar el smartphone
    public String apagar() {
        if (encendido) {
            encendido = false;
            return "Smartphone apagado";
        } else {
            return "El smartphone ya está apagado";
        }
    }

    @Override
    public String toString() {
        return "Smartphone [marca=" + marca + ", modelo=" + modelo + ", almacenamiento=" + almacenamiento
                + "GB, precio=$" + precio + ", estado=" + (encendido ? "Encendido" : "Apagado") + "]";
    }
}

// Clase Dueño
class Dueno {
    private String nombre;
    private int edad;
    private Smartphone[] smartphones;
    private int contadorSmartphones; // Para saber cuántos smartphones hay agregados

    public Dueno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

        // Generamos número aleatorio de smartphones entre 1 y 5
        Random rand = new Random();
        int numSmartphones = rand.nextInt(5) + 1;

        this.smartphones = new Smartphone[numSmartphones];
        this.contadorSmartphones = 0;
    }

    // Agrega un nuevo smartphone al array, si hay espacio
    public void agregarSmartphone(Smartphone nuevoSmartphone) {
        if (contadorSmartphones < smartphones.length) {
            smartphones[contadorSmartphones] = nuevoSmartphone;
            contadorSmartphones++;
        } else {
            System.out.println("No se pueden agregar más smartphones, capacidad máxima alcanzada.");
        }
    }

    // Muestra información de todos los smartphones
    public void listarSmartphones() {
        System.out.println("Smartphones de " + nombre + ":");
        for (int i = 0; i < contadorSmartphones; i++) {
            System.out.println(smartphones[i].toString());
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Smartphone[] getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(Smartphone[] smartphones) {
        this.smartphones = smartphones;
    }
}

// Clase con el método main para probar
public class Main_moviles {
    public static void main(String[] args) {
        Dueno dueno = new Dueno("Ana", 30);

        Random rand = new Random();

        // Creamos smartphones aleatorios y los añadimos al dueño
        for (int i = 0; i < dueno.getSmartphones().length; i++) {
            // Estado encendido aleatorio: 0 = apagado, 1 = encendido
            boolean estado = rand.nextInt(2) == 1;

            // Datos aleatorios de ejemplo para marca, modelo, almacenamiento y precio
            String marca = "Marca" + (i + 1);
            String modelo = "Modelo" + (char)('A' + i);
            int almacenamiento = 16 + i * 16; // 16, 32, 48, ...
            double precio = 200 + i * 100;

            Smartphone sp = new Smartphone(marca, modelo, almacenamiento, precio, estado);
            dueno.agregarSmartphone(sp);
        }

        // Mostrar los smartphones del dueño
        dueno.listarSmartphones();

        // Probar encender/apagar un smartphone
        if (dueno.getSmartphones().length > 0) {
            System.out.println(dueno.getSmartphones()[0].encender());
            System.out.println(dueno.getSmartphones()[0].apagar());
            System.out.println(dueno.getSmartphones()[0].apagar());
        }
    }
}