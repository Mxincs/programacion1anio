package introobjetos;

import java.util.ArrayList;
import java.util.List;

// Clase abstracta que representa un personaje mágico genérico
abstract class PersonajeMagico {
    private String nombre;
    private String casa;
    private int nivelMagico;

    // Constructor para inicializar los atributos comunes
    public PersonajeMagico(String nombre, String casa, int nivelMagico) {
        this.nombre = nombre;
        this.casa = casa;
        this.nivelMagico = nivelMagico;
    }

    // Métodos getter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getCasa() {
        return casa;
    }

    public int getNivelMagico() {
        return nivelMagico;
    }

    // Método abstracto: obliga a las subclases a implementarlo
    public abstract String lanzarHechizo(String hechizo);
}

// Clase Mago que hereda de PersonajeMagico
class Mago extends PersonajeMagico {
    private String varita;
    private String patronus;

    // Constructor con atributos de la clase padre y los nuevos
    public Mago(String nombre, String casa, int nivelMagico, String varita, String patronus) {
        super(nombre, casa, nivelMagico); // Llama al constructor de la clase padre
        this.varita = varita;
        this.patronus = patronus;
    }

    // Métodos getter
    public String getVarita() {
        return varita;
    }

    public String getPatronus() {
        return patronus;
    }

    // Implementación del método abstracto lanzarHechizo
    @Override
    public String lanzarHechizo(String hechizo) {
        return getNombre() + " lanza el hechizo '" + hechizo + "' usando su varita de " + varita;
    }
}

// Clase Auror, una especialización de Mago
class Auror extends Mago {
    private int experienciaCombate;

    // Constructor con todos los atributos
    public Auror(String nombre, String casa, int nivelMagico, String varita, String patronus, int experienciaCombate) {
        super(nombre, casa, nivelMagico, varita, patronus); // Llama al constructor de Mago
        this.experienciaCombate = experienciaCombate;
    }

    // Getter para la experiencia
    public int getExperienciaCombate() {
        return experienciaCombate;
    }

    // Podrías sobrescribir lanzarHechizo aquí si quisieras un comportamiento diferente
    @Override
    public String lanzarHechizo(String hechizo) {
        return getNombre() + " (Auror con " + getExperienciaCombate() + " años de experiencia) lanza el hechizo '" + hechizo + " con su varita de " + getVarita();
    }
}

// Clase principal con el método main
// Clase principal que administra la lista y métodos
public class MundoHarryPotter {

    private ArrayList<PersonajeMagico> personajes; // Lista dinámica de personajes

    // Constructor: inicializa la lista
    public MundoHarryPotter() {
        personajes = new ArrayList<>();
    }

    // Método para agregar un personaje a la lista
    public void agregarPersonaje(PersonajeMagico personaje) {
        personajes.add(personaje);
    }

    // Método para mostrar información y lanzar hechizos
    public void mostrarHechizos() {
        for (PersonajeMagico personaje : personajes) {
            System.out.println("------------------------------------------------------------");

            if (!personaje.getCasa().equalsIgnoreCase("Slytherin")) {
                System.out.println(personaje.getNombre() + " no es de la casa Slytherin.");
            } else {
                System.out.println(personaje.getNombre() + " pertenece a la casa Slytherin.");
            }

            System.out.println(personaje.lanzarHechizo("Expecto Patronum"));
        }
    }

    // Método main solo crea objetos y llama a métodos
    public static void main(String[] args) {
        MundoHarryPotter sistema = new MundoHarryPotter();

        // Crear personajes
        Mago mago1 = new Mago("Hermione Granger", "Gryffindor", 95, "Vid", "Nutria");
        Mago mago2 = new Mago("Luna Lovegood", "Ravenclaw", 80, "Cerezo", "Liebre");
        Auror auror1 = new Auror("Kingsley Shacklebolt", "Gryffindor", 90, "Caoba", "Lince", 15);
        Auror auror2 = new Auror("Nymphadora Tonks", "Slytherin", 85, "Fresno", "Lobo", 8);

        // Agregar personajes
        sistema.agregarPersonaje(mago1);
        sistema.agregarPersonaje(mago2);
        sistema.agregarPersonaje(auror1);
        sistema.agregarPersonaje(auror2);

        // Mostrar hechizos
        sistema.mostrarHechizos();
    }
}