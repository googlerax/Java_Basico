public class Main {


    public static void main(String[] args) {


        CocheCRUDImpl cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

        System.out.println();


    }
}
