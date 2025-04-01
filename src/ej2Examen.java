import java.util.Scanner;

public class ej2Examen
{

    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables
        int [][] notas = new int [4][5];

        //For para recorrer las filas
        for (int i = 0; i < notas.length; i++)
        {
            System.out.println("Introduce la nota del estudiante º" + (i+1));

            for (int j = 0; j < notas[i].length; j++)
            {
                System.out.println("Introduce la nota º" + (j+1));
                notas [i][j] = teclado.nextInt();

            }
        }

        teclado.close();

        for (int i = 0; i < notas.length; i++)
        {
            for (int j = 0; j < notas[i].length; j++)
            {
                System.out.println(notas [i][j]);
            }
        }

    }

}
