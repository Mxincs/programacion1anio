package introarraylist;

import java.util.ArrayList;

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    public void hacerSonido() {

        System.out.println("El perro hace guau");
    }
}

class Gato extends Animal {
    public void hacerSonido() {

        System.out.println("El gato hace miau");
    }
}

class Pollo extends Animal {
    public void hacerSonido() {

        System.out.println("El pollo hace pio");
    }
}

class Rana extends Animal {
    public void hacerSonido() {

        System.out.println("La rana hace croac");
    }
}

class Veterinario {
    public void revisarAnimal (Animal animal) {
        System.out.println("Revision: ");
        animal.hacerSonido();
    }
}

public class Main_anipoli {
    public static void main (String[] args) {

        Veterinario vet1 = new Veterinario();
        Veterinario vet2 = new Veterinario();

        ArrayList <Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Pollo());
        animales.add(new Rana());
        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Animal());

        for (Animal a : animales) {
            if (a instanceof Perro || a instanceof Gato) {
                System.out.println("Veterinario 1");
                vet1.revisarAnimal(a);
            }else{
                System.out.println("Veterinario 2");
                vet2.revisarAnimal(a);
            }
            System.out.println("----------------------------");
        }

    }
}
