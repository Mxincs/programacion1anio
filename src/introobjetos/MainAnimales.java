package introobjetos;

import java.util.ArrayList;

// Clase base Animal
class Animal {
    private String nombre; // Atributo nombre del animal

    // Constructor que inicializa el nombre
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para hacer sonido genérico
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase Perro que hereda de Animal
class Perro extends Animal {
    // Constructor que usa el constructor de la clase base
    public Perro(String nombre) {
        super(nombre);
    }

    // Método hacerSonido específico para perro
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

// Clase Gato que hereda de Animal
class Gato extends Animal {
    // Constructor que usa el constructor de la clase base
    public Gato(String nombre) {
        super(nombre);
    }

    // Método hacerSonido específico para gato
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }
}

// Clase Pez que hereda de Animal
class Pez extends Animal {
    // Constructor que usa el constructor de la clase base
    public Pez(String nombre) {
        super(nombre);
    }

    // Método hacerSonido para pez que NO imprime nada o imprime sonido neutro
    @Override
    public void hacerSonido() {
        // Pez no hace sonido distintivo, no imprime nada
        // System.out.println("");  // Opcional: no hacer nada
        System.out.println("El animal hace un sonido");
    }
}

// Clase principal donde se maneja la lista de animales
class MainAnimales {

    private ArrayList<Animal> listaAnimales; // Lista dinámica para almacenar animales

    // Constructor que inicializa la lista
    public MainAnimales() {
        listaAnimales = new ArrayList<>();
    }

    // Método para agregar un animal a la lista
    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    // Método para mostrar los sonidos y mensajes especiales según condición
    public void mostrarSonidos() {

        // Recorremos cada animal en la lista del arraylist
        for (Animal animal : listaAnimales) {

            System.out.println("-------------------------------");

            // Condición: Si el nombre del animal NO es "Firulais"
            if (!animal.getNombre().equals("Firulais")) {
                // Mostrar mensaje genérico para animales que no son "Firulais"
                System.out.println("Animal en la lista: " + animal.getNombre());
            } else {
                // Mostrar mensaje especial si el animal es "Firulais"
                System.out.println("¡Este es Firulais, el perro favorito!");
            }

            // Llamamos al método hacerSonido() correspondiente a cada animal
            animal.hacerSonido();
        }

    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {

        //guardar animales
        MainAnimales guardado = new MainAnimales();

        // Creamos instancias de animales: Perro, Gato y Pez
        Perro perro1 = new Perro("Firulais");
        Perro perro2 = new Perro("baldomero");
        Gato gato1 = new Gato("Michi");
        Pez pez1 = new Pez("Nemo");

        // Agregamos los animales a la lista
        guardado.agregarAnimal(perro1);
        guardado.agregarAnimal(gato1);
        guardado.agregarAnimal(pez1);
        guardado.agregarAnimal(perro2);

        // Mostramos los sonidos y mensajes, incluyendo la condición con negación
        guardado.mostrarSonidos();
    }
}