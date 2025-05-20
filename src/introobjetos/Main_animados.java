package introobjetos;

import java.util.ArrayList;
import java.util.List;

// Interfaz común para todos los que alegran al personal
interface Alegra {
    String alegrarAlPersonal();
}

// Clase base para dibujos animados
abstract class DibujoAnimado implements Alegra {
    protected String nombre;
    protected int anioAparicion;
    protected String fraseCaracteristica;

    public DibujoAnimado(String nombre, int anioAparicion, String fraseCaracteristica) {
        this.nombre = nombre;
        this.anioAparicion = anioAparicion;
        this.fraseCaracteristica = fraseCaracteristica;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFraseCaracteristica() {
        return fraseCaracteristica;
    }
}

// Hanna Barbera
class HannaBarbera extends DibujoAnimado {
    protected String idiomaDoblaje;

    public HannaBarbera(String nombre, int anioAparicion, String fraseCaracteristica, String idiomaDoblaje) {
        super(nombre, anioAparicion, fraseCaracteristica);
        this.idiomaDoblaje = idiomaDoblaje;
    }

    @Override
    public String alegrarAlPersonal() {
        return "Soy un dibujo Hanna-Barbera y alegro al personal con mi humor en " + idiomaDoblaje;
    }
}

// Warner Brothers
class WarnerBrothers extends DibujoAnimado {
    protected int numIntegrantes;

    public WarnerBrothers(String nombre, int anioAparicion, String fraseCaracteristica, int numIntegrantes) {
        super(nombre, anioAparicion, fraseCaracteristica);
        this.numIntegrantes = numIntegrantes;
    }

    @Override
    public String alegrarAlPersonal() {
        return "Soy un dibujo Warner Brothers y alegro al personal con mi estilo único y mis " + numIntegrantes + " integrantes.";
    }
}

// Pato Lucas, especialización Warner Brothers
class PatoLucas extends WarnerBrothers {
    private int disparosEnLaCara;
    private String colorPlumaje;

    public PatoLucas(int anioAparicion, int numIntegrantes, int disparosEnLaCara, String colorPlumaje) {
        super("Pato Lucas", anioAparicion, "Erez dezzpreciable…", numIntegrantes);
        this.disparosEnLaCara = disparosEnLaCara;
        this.colorPlumaje = colorPlumaje;
    }

    @Override
    public String alegrarAlPersonal() {
        return "¡" + fraseCaracteristica + " Alegro al personal esquivando disparos! (Disparos en cara: " + disparosEnLaCara + ", Plumaje: " + colorPlumaje + ")";
    }
}

// Pedro Picapiedra, especialización Hanna Barbera
class PedroPicapiedra extends HannaBarbera {
    private int numTrajesNaranjas;
    private int decibeliosGrito;

    public PedroPicapiedra(int anioAparicion, String idiomaDoblaje, int numTrajesNaranjas, int decibeliosGrito) {
        super("Pedro Picapiedra", anioAparicion, "Wilmaaa ya estoy en caaasaa!", idiomaDoblaje);
        this.numTrajesNaranjas = numTrajesNaranjas;
        this.decibeliosGrito = decibeliosGrito;
    }

    @Override
    public String alegrarAlPersonal() {
        return "¡" + fraseCaracteristica + " Alegro al personal con " + numTrajesNaranjas + " trajes naranjas y gritos a " + decibeliosGrito + " decibelios!";
    }
}

// Payaso, no es dibujo animado, pero alegra
class Payaso implements Alegra {
    private String nombre;
    private String estilo;

    public Payaso(String nombre, String estilo) {
        this.nombre = nombre;
        this.estilo = estilo;
    }

    @Override
    public String alegrarAlPersonal() {
        return "Soy el payaso " + nombre + " y alegro al personal con mi estilo " + estilo + ".";
    }
}

// Bebida Energética, tampoco dibujo pero alegra
class BebidaEnergetica implements Alegra {
    private String marca;
    private int energia; // nivel de energía que da

    public BebidaEnergetica(String marca, int energia) {
        this.marca = marca;
        this.energia = energia;
    }

    @Override
    public String alegrarAlPersonal() {
        return "Soy la bebida energética " + marca + " y doy " + energia + " niveles de energía para alegrar al personal.";
    }
}

// Clase principal que contiene la lista dinámica y métodos para recorrer
public class Main_animados {

    private List<Alegra> listaElementos;

    public Main_animados() {
        listaElementos = new ArrayList<>();
    }

    // Método para añadir un elemento a la lista
    public void agregarElemento(Alegra elemento) {
        listaElementos.add(elemento);
    }

    // Ejercicio 1: recorre dibujos animados mostrando datos
    public void recorreListaDibujos() {
        for (Alegra elemento : listaElementos) {
            if (elemento instanceof DibujoAnimado) {
                DibujoAnimado da = (DibujoAnimado) elemento;
                System.out.println("Hola, soy " + da.getNombre() + ", me gusta decir \"" + da.getFraseCaracteristica()
                        + "\" y mi forma de alegrar al personal es: " + da.alegrarAlPersonal());
            }
        }
    }

    // Ejercicio 2: recorre lista y muestra alegrarAlPersonal() de todos los elementos
    public void recorreListaGeneral() {
        for (Alegra elemento : listaElementos) {
            System.out.println(elemento.alegrarAlPersonal());
        }
    }

    public static void main(String[] args) {
        Main_animados principal = new Main_animados();

        // Crear objetos Pedro Picapiedra y Pato Lucas
        PedroPicapiedra pedro = new PedroPicapiedra(1960, "Español", 3, 120);
        PatoLucas pato = new PatoLucas(1940, 5, 10, "Verde");

        // Añadir a la lista (Ejercicio 1)
        principal.agregarElemento(pedro);
        principal.agregarElemento(pato);

        System.out.println("=== Ejercicio 1: Sólo dibujos animados ===");
        principal.recorreListaDibujos();

        // Añadir payaso y bebida energética (Ejercicio 2)
        Payaso payaso = new Payaso("Bozo", "payaso clásico");
        BebidaEnergetica bebida = new BebidaEnergetica("RedBull", 100);

        principal.agregarElemento(payaso);
        principal.agregarElemento(bebida);

        System.out.println("\n=== Ejercicio 2: Todos los elementos que alegran al personal ===");
        principal.recorreListaGeneral();
    }
}