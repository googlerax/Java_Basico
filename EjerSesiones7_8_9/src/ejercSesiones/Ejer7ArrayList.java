package ejercSesiones;
import java.util.ArrayList;

public class Ejer7ArrayList {

    //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    //A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
    //y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
    //el primer "for" de relleno.


    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>(10);


        for (int i = 0;i<10;i++) {

            num.add(i+1);

            System.out.println("rellenando el array " + num);

        }

        for(int i=0;i<num.size();i++){

            num.removeIf(n -> (n%2 == 0));   // lambda.

            System.out.println("sin numeros pares " + num);

        }


    }
}
