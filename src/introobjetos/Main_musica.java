package introobjetos;

//Superclase instrumento
class Instrumento {
    private String nombre;
    private String tipo;

    //Constructor
    public Instrumento (String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //Metodos
    public void afinar () {
        System.out.println("Se esta afinando la " + nombre + " con tipo " + tipo);
    }

    public void guardar () {
        System.out.println("Se esta guardando la " + nombre + " con tipo " + tipo);
    }

    //Getters
    public String getNombre () {
        return nombre;
    }

    public String getTipo () {
        return tipo;
    }

}

//clase guitarra que hereda de instrumento
class Guitarra extends Instrumento {
    private int cuerdas;

    //Constructor
    public Guitarra (String nombre, String tipo, int cuerdas) {
        super  (nombre, tipo);
        this.cuerdas = cuerdas;
    }

    //Metodo
    public void tocarAcordes () {
        System.out.println("La guitarra " + getNombre() + " esta tocando con " + cuerdas + " cuerdas.");
    }

}

//clase musico
class Musico {
    private String nombre;
    private Guitarra objetoGuitarra;

    //Constructor
    public Musico(String nombre, Guitarra objetoGuitarra) {
        this.nombre = nombre;
        this.objetoGuitarra = objetoGuitarra;
    }

    //Metodo
    public void ensayar () {
        System.out.println(nombre + " esta ensayando con la guitarra");
        objetoGuitarra.afinar();
    }


}

//MAINNN
public class Main_musica {
    public static void main(String[] args) {

        //Objeto guitarra
        Guitarra guitarra = new Guitarra("yamaha", "2000", 5);

        //Objeto musico
        Musico musico = new Musico("Martin", guitarra);

        //Llamada a metodo ensayar
        musico.ensayar();

        //Llamada a metodo tocaracordes
        guitarra.tocarAcordes();

    }

}
