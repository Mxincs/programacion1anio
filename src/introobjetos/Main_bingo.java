package introobjetos;

import java.util.ArrayList;
import java.util.Random;

// Clase Carton
class Carton {
    private ArrayList<Integer> listaNumeros;
    private int numeroAciertos;

    public Carton() {
        listaNumeros = new ArrayList<>();
        Random rand = new Random();
        while (listaNumeros.size() < 10) {
            int num = rand.nextInt(50) + 1; // números entre 1 y 50
            if (!listaNumeros.contains(num)) {
                listaNumeros.add(num);
            }
        }
        numeroAciertos = 0;
    }

    public void comprobarNumero(int n) {
        if (listaNumeros.contains(n)) {
            numeroAciertos++;
        }
    }

    public void verNumeros() {
        for (int num : listaNumeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Getters y setters
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }
}

// Clase Jugador
class Jugador {
    private String nombre;
    private String dni;
    private ArrayList<Carton> cartones;
    private int saldo;
    private boolean ganador;

    public Jugador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.cartones = new ArrayList<>();
        this.saldo = 0;
        this.ganador = false;
    }

    public void recargarSaldo(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void verCartones() {
        for (int i = 0; i < cartones.size(); i++) {
            System.out.print("Cartón " + (i + 1) + ": ");
            cartones.get(i).verNumeros();
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo + "€");
        verCartones();
    }

    public void comprobarNumero(int numero) {
        for (Carton carton : cartones) {
            carton.comprobarNumero(numero);
            if (carton.getNumeroAciertos() >= 10) {
                ganador = true;
                System.out.println("Cartón premiado, ha acertado todos!!");
                break;
            }
        }
    }

    public void comprarCartones(int cantidad) {
        if (saldo - cantidad >= 0) {
            saldo -= cantidad;
            for (int i = 0; i < cantidad; i++) {
                cartones.add(new Carton());
            }
        } else {
            System.out.println("No tienes saldo suficiente para comprar " + cantidad + " cartones.");
        }
    }

    public boolean isGanador() {
        return ganador;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Carton> getCartones() {
        return cartones;
    }

    public void setCartones(ArrayList<Carton> cartones) {
        this.cartones = cartones;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
}

// Clase Entrada con el método main
public class Main_bingo {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Juan Pérez", "12345678X");

        // Paso 2: Recargar saldo
        jugador.recargarSaldo(40);

        // Paso 3: Comprar 5 cartones
        jugador.comprarCartones(5);

        // Paso 4: Mostrar datos del jugador
        jugador.mostrarDatos();

        // Paso 5: Jugar partida
        Random rand = new Random();
        do {
            int numeroSorteado = rand.nextInt(50) + 1;
            System.out.println("Número sorteado: " + numeroSorteado);
            jugador.comprobarNumero(numeroSorteado);
        } while (!jugador.isGanador());

        System.out.println("¡Fin del juego!");
    }
}