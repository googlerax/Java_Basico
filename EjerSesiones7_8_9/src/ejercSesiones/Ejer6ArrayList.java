package ejercSesiones;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejer6ArrayList {

    //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente
    //el valor de cada elemento.

    public static void main(String[] args) {


        ArrayList<String> miArrayList = new ArrayList<>();

        miArrayList.add ("Buenos aires");
        miArrayList.add ("Brasilia");
        miArrayList.add ("Bogota");
        miArrayList.add ("Ciudad de Mexico");


        for (String i : miArrayList) {

            System.out.println("valor actual " + i);
        }


        // Copia del arrayList a LinkedList

        LinkedList<String> EnlaceList = new LinkedList<>(miArrayList);

        for (String i : EnlaceList) {

            System.out.println("valor actual desde lista de enlace: " + i);
        }

    }
}
