package introarraylist;

import java.util.ArrayList;

public class ej2 {

    public static void main (String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (Integer n : numeros) {
            System.out.println(n);
        }

        System.out.println("-------------------------");

        for (int i = 0; i <numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("-------------------------");

        System.out.println(numeros);

    }
}
