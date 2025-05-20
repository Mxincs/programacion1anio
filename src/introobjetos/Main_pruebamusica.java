package introobjetos;

class instrumento {
    private String nombre;
    private String tipo;
    private boolean sTocar;
    //constructor
    public instrumento(String nombre, String tipo, boolean sTocar) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sTocar = sTocar;
    }
    //metodos
    public void guardar() {
        System.out.println("el instrumento " + nombre + " se ha guardado");
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void afinar() {
        System.out.println("el instrumento " + getNombre() + " de tipo "+ getTipo() +" esta afinado");

    }
    public boolean getStocar() {
        return sTocar;
    }
    public void setStocar() {
        this.sTocar = sTocar;
    }
}
//clase hija de instrumento
class Guitarra extends instrumento {
    private int cuerdas;

    public Guitarra(String nombre, String tipo, boolean sTocar, int cuerdas) {
        super(nombre, tipo, sTocar);
        this.cuerdas = cuerdas;
    }
    public void tocarAcordes() {
        System.out.println("tocando "+ cuerdas + " acordes");
    }
}
//clase hija que hereda de instrumento
class Musico {
    private String nombre;
    private Guitarra guitarra;
    //constructor
    public Musico(String nombre, Guitarra guitarra) {
        this.nombre = nombre;
        this.guitarra = guitarra;
//metodo
    }
    public void ensayar() {
        System.out.println(nombre + " esta ensayando");
        guitarra.afinar();
    }
}
//el main para probar el codigo
public class Main_pruebamusica {
    public static void main(String[]args) {
//crear objetos
        Guitarra miGuitarra = new Guitarra("Guitarreision","cuerda",true,6);
        Musico musico1 = new Musico("antonio",miGuitarra);
//prueba

		/*boolean sTocar = miGuitarra.getStocar();

		if(sTocar){
			musico1.ensayar();
		}
		else {
			System.out.println("no puede tocar");
		}
		*/
        if(!miGuitarra.getStocar()) {
            System.out.println("No puede tocar");
        }
        else {
            musico1.ensayar();
        }
    }


}
