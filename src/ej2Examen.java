import java.util.Scanner;

public class ej2Examen
{

    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        //Manera de crear matrices de forma mas limpia
        int numAlumnos = 2;
        int numNotas = 3;



        //Guardamos el tamaño de numAlumnos y numNotas en la matriz notas para no tener que escribir .length en los for para hacerlo de forma mas sencilla
        int [][] notas = new int [numAlumnos][numNotas];
        double  [] maxAsig = new double[numNotas];
        double  [] maxEst = new double[numAlumnos];




        //For para guardar los numeros por teclado en la matriz
        for (int i = 0; i < numAlumnos; i++)
        {
            System.out.println("Introduce la nota del estudiante º" + (i+1));
            System.out.println("--------------------------------------------");

            for (int j = 0; j < numNotas; j++)
            {
                System.out.println("Introduce la nota º" + (j+1));
                notas [i][j] = teclado.nextInt();

            }
        }
        teclado.close();



        //Primer for para recorrer la matriz POR FILAS para mostrar la media por alumno
        for (int i = 0; i < numAlumnos; i++)
        {

            //Creamos la variable mediaEst para mostrar por pantalla la media de los estudiantes POR FILA
            double mediaEst = 0;
            int vecesEst = 0;

            for (int j = 0; j < numNotas; j++)
            {

                //Sumamos las notas por estudiante y las guardamos en mediaEst para luego hacer la media
                mediaEst += (double) notas [i][j];

                //Contamos las veces que se repite cada estudiante para luego dividirlo en la salida
                vecesEst++;

            }

            //Mostramos por pantalla la media despues del segundo for para asi reiniciar la mediaEst a 0 de nuevo al comenzar la siguiente fila
            System.out.println("La media del estudiante º" + (i+1) + " es: " + (mediaEst/vecesEst));

            //Guardamos en el array maxEst la media por estudiantes
            maxEst [i]= mediaEst/vecesEst;
        }


        double nummaxEst = 0;


        //for para mostrar la media maxima de los alumnos
        for (int i = 0; i < numAlumnos; i++)
        {

            if (maxEst [i]> nummaxEst)
            {
                nummaxEst = maxEst [i];
            }
        }

        System.out.println(nummaxEst);



        System.out.println("-----------------------------------------------------------------");



        //Segundo for para recorrer la matriz POR COLUMNAS para mostrar la media por asignatura
        for (int j = 0; j < numNotas; j++)
        {

            //Creamos la variable mediaAsig para mostrar por pantalla la media de las asignaturas POR COLUMNAS
            double mediaAsig = 0;

            for (int i = 0; i < numAlumnos; i++)
            {

                //Sumamos las notas por asignaturas y las guardamos en mediaAsig para luego hacer la media
                mediaAsig += (double) notas[i][j];

            }

            //Mostramos por pantalla la media despues del segundo for para asi reiniciar la mediaAsig a 0 de nuevo al comenzar la siguiente columna
            System.out.println("La media de la asignatura º" + (j+1) + " es: " + (mediaAsig/numAlumnos));

        }

    }

}
