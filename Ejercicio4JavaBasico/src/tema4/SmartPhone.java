package tema4;

public class SmartPhone extends SmartDevice {


//atributos


    private String nombre;
    private String fabricante;
    private String modelo;
    private String procesador;
    private String tipoDepantalla;
    private int memoriaRam;
    private int camTrasera;
    private int camDelantera;
    private int bateria;


    // constructores

    public SmartPhone() {

    }

    public SmartPhone(String nombre, boolean conexionWIFI, boolean conexionBluetooth, boolean pantallaTactil, String fabricante, String modelo, String procesador, String tipoDepantalla, int memoriaRam, int camTrasera, int camDelantera, int bateria) {
        super(conexionWIFI, conexionBluetooth, pantallaTactil);
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tipoDepantalla = tipoDepantalla;
        this.memoriaRam = memoriaRam;
        this.camTrasera = camTrasera;
        this.camDelantera = camDelantera;
        this.bateria = bateria;
    }


    //metodos

    public void informarCaracteristicas() {

        super.informarCaracteristicas();
        System.out.println("tipo de dispositivo: " + nombre);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Procesador: " + procesador);
        System.out.println("Tipo de pantalla: " + tipoDepantalla);
        System.out.println(String.format("Memoria ram: %s GB", memoriaRam));
        System.out.println(String.format("Camara trasera: %s Mpx", camTrasera));
        System.out.println(String.format("Camara frontal: %s Mpx", camDelantera));
        System.out.println(String.format("Bateria: %s mAh", bateria));


    }

    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipoDepantalla() {
        return tipoDepantalla;
    }

    public void setTipoDepantalla(String tipoDepantalla) {
        this.tipoDepantalla = tipoDepantalla;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getCamTrasera() {
        return camTrasera;
    }

    public void setCamTrasera(int camTrasera) {
        this.camTrasera = camTrasera;
    }

    public int getCamDelantera() {
        return camDelantera;
    }

    public void setCamDelantera(int camDelantera) {
        this.camDelantera = camDelantera;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}








