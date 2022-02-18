package ejercSesiones;

public class Ejer3ArrayBidi {

//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas
//dimensiones.


    public static void main(String[] args) {


        int[][] arrayDosDimen = new int[3][2];    // array bidimensional

        arrayDosDimen[0][0] = 14;
        arrayDosDimen[0][1] = 20;

        arrayDosDimen[1][0] = 7;
        arrayDosDimen[1][1] = 1;

        arrayDosDimen[2][0] = 75;
        arrayDosDimen[2][1] = 35;


        for (int i = 0; i < arrayDosDimen.length; i++) {

            for (int j = 0; j < arrayDosDimen[1].length; j++) {

                System.out.println("Estoy en i = " + i + ", j = " + j + " Y su valor es = " + arrayDosDimen[i][j]);


            }

        }


    }
}
