package introobjetos;

import java.util.ArrayList;
import java.util.List;

// Interfaz común que obliga a implementar correr()
interface Corredor {
    String correr();
}

// Clase base Deportista
abstract class Deportista implements Corredor {
    protected String nombre;
    protected int edad;
    protected int premiosIndividuales;
    protected int premiosGrupales;

    public Deportista(String nombre, int edad, int premiosIndividuales, int premiosGrupales) {
        this.nombre = nombre;
        this.edad = edad;
        this.premiosIndividuales = premiosIndividuales;
        this.premiosGrupales = premiosGrupales;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto correr() ya está definido en la interfaz Corredor
}

// Atleta
abstract class Atleta extends Deportista {
    protected boolean usaMayas;    // true = mayas, false = pantaloncitos cortos
    protected boolean llevaZapatillas; // true = zapatillas, false = descalzo

    public Atleta(String nombre, int edad, int premiosInd, int premiosGrp, boolean usaMayas, boolean llevaZapatillas) {
        super(nombre, edad, premiosInd, premiosGrp);
        this.usaMayas = usaMayas;
        this.llevaZapatillas = llevaZapatillas;
    }
}

// Vallista
class Vallista extends Atleta {
    private int numVallasTiradas;

    public Vallista(String nombre, int edad, int premiosInd, int premiosGrp, boolean usaMayas, boolean llevaZapatillas, int numVallasTiradas) {
        super(nombre, edad, premiosInd, premiosGrp, usaMayas, llevaZapatillas);
        this.numVallasTiradas = numVallasTiradas;
    }

    @Override
    public String correr() {
        return "corro saltando vallas y he tirado " + numVallasTiradas + " vallas.";
    }
}

// Tirafondista
class Tirafondista extends Atleta {
    private double mejorTiempo;  // en minutos
    private double distanciaMaxima; // en km

    public Tirafondista(String nombre, int edad, int premiosInd, int premiosGrp, boolean usaMayas, boolean llevaZapatillas,
                        double mejorTiempo, double distanciaMaxima) {
        super(nombre, edad, premiosInd, premiosGrp, usaMayas, llevaZapatillas);
        this.mejorTiempo = mejorTiempo;
        this.distanciaMaxima = distanciaMaxima;
    }

    @Override
    public String correr() {
        return "corro largas distancias. Mejor tiempo: " + mejorTiempo + " min, distancia máxima: " + distanciaMaxima + " km.";
    }
}

// Futbolista
abstract class Futbolista extends Deportista {
    protected String modeloBalonFavorito;
    protected boolean cespedArtificial; // true= artificial, false = natural

    public Futbolista(String nombre, int edad, int premiosInd, int premiosGrp, String modeloBalonFavorito, boolean cespedArtificial) {
        super(nombre, edad, premiosInd, premiosGrp);
        this.modeloBalonFavorito = modeloBalonFavorito;
        this.cespedArtificial = cespedArtificial;
    }
}

// Palomero (delantero)
class Palomero extends Futbolista {
    private int minutosQuieto;

    public Palomero(String nombre, int edad, int premiosInd, int premiosGrp, String modeloBalonFavorito, boolean cespedArtificial, int minutosQuieto) {
        super(nombre, edad, premiosInd, premiosGrp, modeloBalonFavorito, cespedArtificial);
        this.minutosQuieto = minutosQuieto;
    }

    @Override
    public String correr() {
        return "corro poco. Puedo estar " + minutosQuieto + " minutos quieto en el campo sin moverme.";
    }
}

// Portero
class Portero extends Futbolista {
    private String tallaGuantes;
    private boolean manoCambiada; // true = se tira a mano cambiada, false = no

    public Portero(String nombre, int edad, int premiosInd, int premiosGrp, String modeloBalonFavorito, boolean cespedArtificial,
                   String tallaGuantes, boolean manoCambiada) {
        super(nombre, edad, premiosInd, premiosGrp, modeloBalonFavorito, cespedArtificial);
        this.tallaGuantes = tallaGuantes;
        this.manoCambiada = manoCambiada;
    }

    @Override
    public String correr() {
        return "corro para cubrir el arco. Uso guantes talla " + tallaGuantes + (manoCambiada ? " y me tiro a mano cambiada." : ".");
    }
}

// Caballo Pura Sangre
class Caballo implements Corredor {
    private String nombre;
    private int edad;

    public Caballo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String correr() {
        return "Soy el caballo " + nombre + " y corro con gran velocidad.";
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase principal
public class Main_deportistas {
    private List<Corredor> elementos;

    public Main_deportistas() {
        elementos = new ArrayList<>();
    }

    public void agregarCorredor(Corredor c) {
        elementos.add(c);
    }

    public void recorreListaDeportistas() {
        for (Corredor c : elementos) {
            String tipo = "desconocido";

            if (c instanceof Deportista) {
                Deportista d = (Deportista) c;
                if (d instanceof Atleta) tipo = "ATLETA";
                else if (d instanceof Futbolista) tipo = "FUTBOLISTA";
                else tipo = "DEPORTISTA";
                System.out.println("Hola, soy " + d.getNombre() + ", soy " + tipo + " y mi forma de correr es: " + c.correr());
            } else if (c instanceof Caballo) {
                Caballo cab = (Caballo) c;
                System.out.println("Hola, soy " + cab.getNombre() + ", soy un CABALLO y mi forma de correr es: " + c.correr());
            } else {
                System.out.println("Elemento desconocido en la lista.");
            }
        }
    }

    public static void main(String[] args) {
        Main_deportistas main = new Main_deportistas();

        // Crear deportistas
        Vallista vallista = new Vallista("Juan", 25, 5, 3, true, true, 20);
        Tirafondista tirafondista = new Tirafondista("Luis", 30, 2, 1, false, true, 15.5, 42.0);
        Palomero palomero = new Palomero("Carlos", 28, 10, 5, "Tango", true, 12);
        Portero portero = new Portero("Miguel", 27, 8, 6, "Questra", false, "L", true);

        // Caballo
        Caballo caballo = new Caballo("Relámpago", 6);

        // Agregar a la lista
        main.agregarCorredor(vallista);
        main.agregarCorredor(tirafondista);
        main.agregarCorredor(palomero);
        main.agregarCorredor(portero);
        main.agregarCorredor(caballo);

        // Recorrer y mostrar info
        main.recorreListaDeportistas();
    }
}
