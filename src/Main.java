// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[]{
                new Milk("Milk", 60),
                new Milk("Milk", 60),
                new Milk("Milk", 60),
                new Milk("Milk", 60),
                new Milk("Milk", 60),

                new Corn("Corn", 150),
                new Corn("Corn", 150),
                new Corn("Corn", 150),
                new Corn("Corn", 150),
                new Corn("Corn", 150),

                new Salt("Salt", 0),
                new Salt("Salt", 0),
                new Salt("Salt", 0),
                new Salt("Salt", 0),
                new Salt("salt", 0),

                new Stew("Stew", 180),
                new Stew("Stew", 180),
                new Stew("Stew", 180),
                new Stew("Stew", 180),
                new Stew("stew", 180),

                new Fish("Fish", 20)};


        Store store = new Store();
        store.setProducts(products);
        store.doInspection();



                }


    }
