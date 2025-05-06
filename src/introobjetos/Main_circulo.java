package introobjetos;

class Circulo {

    double radio = 1;

    public Circulo () {
        //this.radio = 1;
    }

    public Circulo (double radio) {
        this.radio = radio;
    }

    double mostrarArea () {
        return radio * radio * Math.PI;
    }

    double mostrarPerimetro () {
        return 2 * radio * Math.PI;
    }

    void mostrarRadio (double nuevoRadio) {
        radio = nuevoRadio;
    }

}



public class Main_circulo {

    public static void main (String[] args) {

        Circulo circulo1 = new Circulo();
        System.out.println("El area del circulo de: " + circulo1.radio + " es " + circulo1.mostrarArea());

        Circulo circulo2 = new Circulo(25);
        System.out.println("El area del circulo de: " + circulo2.radio + " es " + circulo2.mostrarArea());

        Circulo circulo3 = new Circulo(125);
        System.out.println("El area del circulo de: " + circulo3.radio + " es " + circulo3.mostrarArea());

    }

}