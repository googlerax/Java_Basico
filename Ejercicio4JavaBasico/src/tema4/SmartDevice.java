package tema4;

public class SmartDevice {


    //atributos
    private boolean conexionWIFI;
    private boolean conexionBluetooth;
    private boolean pantallaTactil;


    //constructores

    public SmartDevice() {
    }

    public SmartDevice(boolean conexionWIFI, boolean conexionBluetooth, boolean pantallaTactil) {
        this.conexionWIFI = conexionWIFI;
        this.conexionBluetooth = conexionBluetooth;
        this.pantallaTactil = pantallaTactil;
    }


    // método

    public void informarCaracteristicas() {

        if (conexionWIFI = true) {

            System.out.println("Con conexion WIFI");
        }
        if (conexionBluetooth = true) {
            System.out.println("Con conexion Bluetooth");
        }
        if (pantallaTactil = true) {

            System.out.println("Con pantalla tactil");
        }


    }

    //getters y Setters

    public boolean isConexionWIFI() {
        return conexionWIFI;
    }

    public void setConexionWIFI(boolean conexionWIFI) {
        this.conexionWIFI = conexionWIFI;
    }

    public boolean isConexionBluetooth() {
        return conexionBluetooth;
    }

    public void setConexionBluetooth(boolean conexionBluetooth) {
        this.conexionBluetooth = conexionBluetooth;
    }

    public boolean isPantallaTactil() {
        return pantallaTactil;
    }

    public void setPantallaTactil(boolean pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }
}

