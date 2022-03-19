package sentencias_Control;

public class Switch {

    public static void main(String[] args) {

        String estacion = "Verano";

        switch(estacion)
        {
            case "Primavera":
                System.out.println("Es primavera.");
                break;
            case "Verano":
                System.out.println("Es verano.");
                break;
            case "Otoño":
                System.out.println("Es otoño.");
                break;
            case "Invierno":

                System.out.println("Es invierno.");
                break;
            default:
                System.out.println("No coincide con ninguna estacion dela año.");
        }










    }

}
