package ejercSesiones;

public class Ejer1Reverse {

    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

    public static void main(String[] args) {

        System.out.println(reverse(".otsixe ogeul ,osneip"));


    }

    public static String reverse(String texto) {

        if (texto.length() == 0)

            return texto;

        return reverse(texto.substring(1)) + texto.charAt(0);
    }


}
