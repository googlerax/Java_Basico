package ejercSesiones;

import java.util.Vector;

public class Ejer4Vector {

    public static void main(String[] args) {


        Vector<String> superHeroes = new Vector<>();


        // elementos

        superHeroes.add("Batman");
        superHeroes.add("Superman");
        superHeroes.add("mujer maravilla");  // 2do elemento.
        superHeroes.add("Spiderman");        // 3er elemento.
        superHeroes.add("Iroman");

        for (int i = 0; i < superHeroes.size(); i++) {

            System.out.println(superHeroes.get(i) + " Esta en  la posicion " + i);

        }

        // 2do y 3er elementos removidos

        superHeroes.remove(2);
        superHeroes.remove(3);


        for (int i = 0; i < superHeroes.size(); i++) {

            System.out.println("----->" + superHeroes.get(i) + " Ahora esta en  la posicion " + i);

        }


    }

}
