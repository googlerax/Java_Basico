package tema4;

public class SmartWatch extends SmartDevice {

    //atributos


    private String nombre;
    private String tipoPantalla;
    private double screenSize;
    private boolean sensorCardiaco;
    private int peso;
    private int bateria;
    private double versionBluetooth;


    //contructores

    public SmartWatch() {

    }

    public SmartWatch(boolean conexionWIFI, boolean conexionBluetooth, boolean pantallaTactil, String nombre, String tipoPantalla, double screenSize, boolean sensorCardiaco, int peso, int bateria, double versionBluetooth) {
        super(conexionWIFI, conexionBluetooth, pantallaTactil);
        this.nombre = nombre;
        this.tipoPantalla = tipoPantalla;
        this.screenSize = screenSize;
        this.sensorCardiaco = sensorCardiaco;
        this.peso = peso;
        this.bateria = bateria;
        this.versionBluetooth = versionBluetooth;
    }

    //metodo

    public void informarCaracteristicas() {
        super.informarCaracteristicas();

        System.out.println("Tipo de dispositivo: " + nombre);
        System.out.println("Tipo de pantalla: " + tipoPantalla);
        System.out.println(String.format("Tamaño de pantalla: %s px", screenSize));
        System.out.println(String.format("Peso: %s Pulgadas", peso));
        System.out.println(String.format("bateria: %s mAh", bateria));
        System.out.println("Version de bluetooth: " + versionBluetooth);
        if (sensorCardiaco = true) {
            System.out.println("Sensor cardiaco PPG");
        }


    }

    //getter y setter

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSensorCardiaco() {
        return sensorCardiaco;
    }

    public void setSensorCardiaco(boolean sensorCardiaco) {
        this.sensorCardiaco = sensorCardiaco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public double getVersionBluetooth() {
        return versionBluetooth;
    }

    public void setVersionBluetooth(double versionBluetooth) {
        this.versionBluetooth = versionBluetooth;
    }
}
