package encapsulacion;

public class Main {
    public static void main(String[] args) {


        Persona usuario1 = new Persona(24,"Javier","555-417");

        Cliente usuario2 = new Cliente(36,"Maria","555-4",40);

        Trabajador trabajador1 = new Trabajador(40,"Marcelo","555-4712",27000);

        System.out.println(usuario1.getNombre() +" "+ usuario1.getTelefono()+ " "+ usuario1.getEdad() + " años.");

        System.out.println(usuario2.getNombre() +" "+ usuario2.getTelefono() + " " + usuario2.getEdad() + " " + usuario2.getCredito());

        System.out.println(trabajador1.getNombre() +" "+trabajador1.getTelefono() +" "+ trabajador1.getEdad()+" años "+trabajador1.getSalario());













    }




}
