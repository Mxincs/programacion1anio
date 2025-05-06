package introarraylist;

import java.util.ArrayList;

public class ej1 {

    public static void main (String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

            nombres.add("a");
            nombres.add("b");
            nombres.add("c");
            nombres.add("d");
            nombres.add("e");

        for (String n : nombres) {
                System.out.println(n);
        }

        System.out.println("-------------------------");

        for (int i = 0; i <nombres.size(); i++){
            System.out.println(nombres.get(i));
        }

        System.out.println("-------------------------");

        System.out.println(nombres);

        System.out.println("-------------------------");

        System.out.println(nombres.get(2));

    }

}
