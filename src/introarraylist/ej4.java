package introarraylist;

import java.util.ArrayList;

public class ej4 {

    public static void main (String[] args) {

        ArrayList <String> frutas = new ArrayList<>();
        frutas.add("Mansana");
        frutas.add("platano");
        frutas.add("sandia");
        frutas.add("coco");

        System.out.println(frutas.contains("sandia"));

        System.out.println(frutas.contains("pera"));

    }

}
