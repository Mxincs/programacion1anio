package introarraylist;

import java.util.ArrayList;

public class ej3 {

    public static void main (String[] args) {

        ArrayList<String> ciudades = new ArrayList<>();

        ciudades.add("Madrid");
        ciudades.add("Zurich");
        ciudades.add("Amsterdam");

        for (String n : ciudades) {
            System.out.println(n);
        }

        System.out.println("-------------------------");

        for (int i = 0; i <ciudades.size(); i++){
            System.out.println(ciudades.get(i));
        }

        System.out.println("-------------------------");

        System.out.println(ciudades);

        System.out.println("-------------------------");

        ciudades.remove(1);

        for (String n : ciudades) {
            System.out.println(n);
        }

        System.out.println("-------------------------");

        for (int i = 0; i <ciudades.size(); i++){
            System.out.println(ciudades.get(i));
        }

        System.out.println("-------------------------");

        System.out.println(ciudades);

    }

}
