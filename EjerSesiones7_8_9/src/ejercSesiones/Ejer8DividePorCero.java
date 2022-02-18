package ejercSesiones;

public class Ejer8DividePorCero {

    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    //que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
    // "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

    public static void main(String[] args) {

        try {

            System.out.println(dividePorCero(8, 0));

        } catch (ArithmeticException e) {

            System.out.println("Esto no puede hacerse");

        }
        System.out.println("Demo de codigo");
    }

    public static int dividePorCero(int num1, int num2) throws ArithmeticException {

        int resultado;

        try {
            resultado = num1 / num2;

        } catch (ArithmeticException e) {

            throw new ArithmeticException();

        }

        return resultado;


    }
}
