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



        //Variables para guardar el maximo de media
        double  [] maxEst = new double[numAlumnos];
        double nummaxEst = 0;
        int indiceEst = 0;

        double  [] maxAsig = new double[numNotas];
        double nummaxAsig = 0;
        int indiceAsig = 0;



        //For para guardar los numeros por teclado en la matriz
        for (int i = 0; i < numAlumnos; i++)
        {
            System.out.println("Introduce la nota del estudiante º" + (i+1));
            System.out.println("---------------------------------------");

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
                mediaEst += notas [i][j];

                //Contamos las veces que se repite cada estudiante para luego dividirlo en la salida
                vecesEst++;

            }

            double mediafinalEst = mediaEst / numNotas;

            //Mostramos por pantalla la media despues del segundo for para asi reiniciar la mediaEst a 0 de nuevo al comenzar la siguiente fila
            System.out.println("La media del estudiante º" + (i+1) + " es: " + (mediafinalEst));

            //Guardamos en el array maxEst la media por estudiantes
            maxEst [i]= mediafinalEst;

        }



        //for para guardar la media maxima de los alumnos
        for (int i = 0; i < numAlumnos; i++)
        {

            if (maxEst [i]> nummaxEst)
            {
                nummaxEst = maxEst [i];
                indiceEst = i;
            }
        }



        System.out.println("---------------------------------------");



        //Segundo for para recorrer la matriz POR COLUMNAS para mostrar la media por asignatura
        for (int j = 0; j < numNotas; j++)
        {

            //Creamos la variable mediaAsig para mostrar por pantalla la media de las asignaturas POR COLUMNAS
            double mediaAsig = 0;
            int vecesAsig = 0;

            for (int i = 0; i < numAlumnos; i++)
            {

                //Sumamos las notas por asignaturas y las guardamos en mediaAsig para luego hacer la media
                mediaAsig += notas[i][j];

                //Contamos las veces que se repite cada asignatura para luego dividirlo en la salida
                vecesAsig++;

            }

            double mediafinalAsig = mediaAsig / numAlumnos;

            //Mostramos por pantalla la media despues del segundo for para asi reiniciar la mediaAsig a 0 de nuevo al comenzar la siguiente columna
            System.out.println("La media de la asignatura º" + (j+1) + " es: " + (mediafinalAsig));

            //Guardamos en el array maxEst la media por asignaturas
            maxAsig [j]= mediafinalAsig;

        }



        //for para guardar la media maxima de las asignaturas
        for (int j = 0; j < numNotas; j++)
        {

            if (maxAsig [j] > nummaxAsig)
            {
                nummaxAsig = maxAsig [j];
                indiceAsig = j;
            }
        }



        System.out.println("---------------------------------------");

        //Mostramos la media maxima de los alumnos por pantalla
        System.out.println("La media maxima es del estudiante nº" + (indiceEst+1) + " con " + nummaxEst);

        //Mostramos la media maxima de las asignaturas por pantalla
        System.out.println("La media maxima es de la asignatura nº" + (indiceAsig+1) + " con " + nummaxAsig);

    }

}
