package introobjetos;

import java.util.HashMap;
import java.util.Map;

// Clase base
class PersonajeMagico {
    private String nombre;
    private String casa;
    private int nivelMagico;

    public PersonajeMagico(String nombre, String casa, int nivelMagico) {
        this.nombre = nombre;
        this.casa = casa;
        this.nivelMagico = nivelMagico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCasa() {
        return casa;
    }

    public int getNivelMagico() {
        return nivelMagico;
    }

    public String lanzarHechizo(String hechizo) {
        return nombre + " está lanzando el hechizo: " + hechizo;
    }
}

// Subclase Mago
class Mago extends PersonajeMagico {
    private String varita;
    private String patronus;

    public Mago(String nombre, String casa, int nivelMagico, String varita, String patronus) {
        super(nombre, casa, nivelMagico);
        this.varita = varita;
        this.patronus = patronus;
    }

    public String getVarita() {
        return varita;
    }

    public String getPatronus() {
        return patronus;
    }
}

// Subclase específica: Auror
class Auror extends Mago {
    private int experienciaCombate;

    public Auror(String nombre, String casa, int nivelMagico, String varita, String patronus, int experienciaCombate) {
        super(nombre, casa, nivelMagico, varita, patronus);
        this.experienciaCombate = experienciaCombate;
    }

    public int getExperienciaCombate() {
        return experienciaCombate;
    }
}

// Clase principal para prueba
public class MundoHarryPotter {
    public static void main(String[] args) {
        // Crear HashMap con clave String y valor PersonajeMagico (polimorfismo)
        HashMap<String, PersonajeMagico> personajes = new HashMap<>();

        // Crear instancias de Auror
        Auror auror1 = new Auror("Kingsley Shacklebolt", "Gryffindor", 90, "Caoba", "Lince", 15);
        Auror auror2 = new Auror("Nymphadora Tonks", "Hufflepuff", 85, "Fresno", "Lobo", 8);
        Auror auror3 = new Auror("Alastor Moody", "Desconocida", 95, "Roble", "Águila", 30);

        // Almacenar en el HashMap usando sus nombres como claves
        personajes.put(auror1.getNombre(), auror1);
        personajes.put(auror2.getNombre(), auror2);
        personajes.put(auror3.getNombre(), auror3);

        // Recorrer e invocar al método lanzarHechizo
        for (Map.Entry<String, PersonajeMagico> entry : personajes.entrySet()) {
            PersonajeMagico personaje = entry.getValue();
            System.out.println(personaje.lanzarHechizo("Expecto Patronum"));
        }
    }
}
