package introobjetos;

import java.util.ArrayList;
import java.util.Scanner;

// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected String marca; // Atributo marca

    // Constructor
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto
    public abstract void mover();
}

// Subclase Coche
class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("El coche " + marca + " se mueve por carretera.");
    }
}

// Subclase Bicicleta
class Bicicleta extends Vehiculo {
    public Bicicleta(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta " + marca + " se mueve por el carril bici.");
    }
}

// Subclase Patinete
class Patinete extends Vehiculo {
    public Patinete(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("El patinete " + marca + " se desliza por la acera.");
    }
}

// Clase principal
public class MainVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para leer datos por teclado
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>(); // Lista dinámica de vehículos

        // Repetimos 3 veces para cada tipo de vehículo
        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce la marca del coche #" + i + ": ");
            String marcaCoche = sc.nextLine();
            listaVehiculos.add(new Coche(marcaCoche)); // Agrega coche a la lista
        }

        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce la marca de la bicicleta #" + i + ": ");
            String marcaBici = sc.nextLine();
            listaVehiculos.add(new Bicicleta(marcaBici)); // Agrega bicicleta a la lista
        }

        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce la marca del patinete #" + i + ": ");
            String marcaPatinete = sc.nextLine();
            listaVehiculos.add(new Patinete(marcaPatinete)); // Agrega patinete a la lista
        }

        System.out.println("\n--- Movimientos de los vehículos ---");
        for (Vehiculo v : listaVehiculos) {
            v.mover(); // Invoca el método correspondiente según el tipo de vehículo
        }

        sc.close(); // Cerramos el Scanner
    }
}