package ejercSesiones;

public class Ejer2ArrayUni {

    //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

    public static void main(String[] args) {

        String[] componentesPc = {

                "Motherboard",
                "Microprocesador",
                "Memoria Ram",
                "Disco rigido o Disco SSD",
                "fuente de poder",
                "Perifericos",
        };

        for (String elementos : componentesPc) {    //recorre los valores del array

            System.out.println(elementos);

        }


    }
}
