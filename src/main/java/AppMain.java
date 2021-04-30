public class AppMain {

    public static void main(String[] args) {

        ProductDb productdb = new ProductDb();
        System.out.println(productdb.list());
        System.out.println(productdb.toString());


    }
}
