package ejercSesiones;

import java.io.*;

public class Ejer9InputYPrint {

    //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    //La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

    public static void main(String[] args) {


        try {
            InputStream entrada = new FileInputStream("fileIn.txt");

            byte[] contenido = entrada.readAllBytes();

            PrintStream salida = new PrintStream("fileOut.txt");

            salida.write(contenido);


        } catch (FileNotFoundException e) {

            System.out.println("Excepcion : " + e.getMessage());

        } catch (IOException e) {

            System.out.println("Excepcion : " + e.getMessage());

        }


    }
}
