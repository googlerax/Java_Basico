package tema4;

public class Main {


    public static void main(String[] args) {


        //crear objeto Smartdevice, con el constructor vacío:


        SmartDevice smartDevice = new SmartDevice();

        smartDevice = new SmartDevice(true, true, true);


        //objeto Smartphone

        SmartPhone smartPhone = new SmartPhone();
        smartPhone = new SmartPhone("Telefono inteligente", true, true, true, "Samsung", "GSM-541", "Exynox 889", "superAMOLED Infinity Display", 4, 12, 8, 3500);

        smartPhone.informarCaracteristicas();
        System.out.println();


        //objeto Smartwatch

        SmartWatch smartWatch = new SmartWatch();
        smartWatch = new SmartWatch(true, true, true, "Reloj inteligente", "AMOLED", 0.95, true, 22, 135, 5.0);

        smartWatch.informarCaracteristicas();

        System.out.println();


    }


}
