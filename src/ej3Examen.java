/* Array para sacar el maximo
double[] salarios = {2500.50, 3000.75, 1500.00, 4200.30, 2800.80};

        // Inicializamos el máximo con un valor muy bajo
        double salarioMaximo = salarios[0];

        // Recorremos el array para encontrar el salario máximo
        for (int i = 1; i < salarios.length; i++) {
        if (salarios[i] > salarioMaximo) {
        salarioMaximo = salarios[i];
        }*/

import java.util.Arrays;
import java.util.Scanner;

public class ej3Examen {


    //metodo con el que puedo multiplicar el salario por nombres USAR JAVA.UTIL.ARRAYS
    public static String[]salarios (String [] nombres, int [] horas, int [] tarifa) {

        //El return va a ser los resultados totales y va a ser un string
        String [] resultados = new String[3];

        for (int i = 0; i < 3; i++){ /*calculo en la marcha el salario asi
                                    cuando pase a la linea de resultados[i] me vaya
                                    calculando el salario mas el nombre y lo guarde uno a uno en un array*/

            double salario = (double) horas[i] * (double) tarifa[i];
            resultados[i] = "Empleado: " + nombres[i] + ", Salario: " + salario;
        }
        return resultados;
    }


    //Metodo para calcular la suma de todos los salarios
    public static String salariostotales (int [] horas, int [] tarifa) {
        double salariototal = 0;

        for (int i = 0; i < 3; i++) { /*Como en el anterior caso puedo sumar en una variable
                                        temporal los salarios para asi luego sumarlos todos y guardarlos en salario total*/
            double salario = (double) horas[i] * (double) tarifa[i];
            salariototal += salario;
        }

        return "El salario total es: " + salariototal;

    }



    //Metodo para sacar el maximo y el minimo y su nombre
    public static String salarioMax (String [] nombres, int [] horas, int [] tarifa) {

        double salariomax = 0;
        String empleadoMaximo = "";

        for (int i = 0; i < horas.length; i++) {
            // Calculamos el salario del empleado
            double salario = (double) horas[i] * (double) tarifa[i];

            // Si el salario actual es mayor que el salario máximo, lo actualizamos
            if (salario > salariomax) {
                salariomax = salario;
                empleadoMaximo = nombres[i];
            }

        }

        return "El salalario maximo es de: " + salariomax + " y es del empleado: " + empleadoMaximo;

    }


    //METODO MAINNNNNN
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables para nombres
        String[] nombres = new String[3];

        //Variables para horas trabajadas
        int[] horas = new int[3];

        //Variable para tarifa
        int[] tarifa = new int[3];



        //Pido el nombre por teclado
        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Introduce el nombre del empleado º" + (i + 1));
            nombres[i] = teclado.nextLine();

        }

        System.out.println("-----------------------------------------------------");

        //pido las horas por teclado
        for (int i = 0; i < horas.length; i++) {
            System.out.println("Introduce las horas trabajadas del empleado º" + (i + 1));
            horas[i] = teclado.nextInt();
        }

        System.out.println("-----------------------------------------------------");


        //Pido la tarifa por teclado
        for (int i = 0; i < tarifa.length; i++) {
            System.out.println("Introduce la tarifa del empleado º" + (i + 1));
            tarifa[i] = teclado.nextInt();
        }

        System.out.println("-----------------------------------------------------");

        teclado.close();

            //llamada a metodos
            System.out.println("Salarios de los empleados:" + Arrays.toString(salarios(nombres, horas, tarifa)));
            System.out.println(salariostotales(horas, tarifa));
            System.out.println(salarioMax(nombres, horas, tarifa));

    }

}
