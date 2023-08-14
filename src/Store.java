public class Store {

    Product [] products;

    public void doInspection(){
        int count=1;
        System.out.println("======================= Inspection result ======================= \n" +
                           "Product | Produced On | Storage place | life days | Fresh\n" +
                           "\n"+
                           "-----------+---------------+---------------+--------------+------------+ ");
        for(Product pp: this.products){
            System.out.printf("%d %s| %s          | %s            | %d | %s \n", count,pp.getProductName(), pp.getProduceOn(), pp.getPlaceOfProducts(), pp.getExpDay(), pp.getIsFresh());
            count++;
        }

    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

}
