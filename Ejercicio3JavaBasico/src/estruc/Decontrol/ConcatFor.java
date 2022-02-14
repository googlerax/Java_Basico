package estruc.Decontrol;

public class ConcatFor {

    public static void main(String[] args) {

        String[] paises = {"Argentina", "Chile", "Brasil", "Paraguay", "Uruguay"};

        String concatenar = "";

        for (int i = 0; i < paises.length; i++) {


            concatenar = concatenar + paises[i] + " ";

        }

        System.out.println(concatenar);

    }

}