import java.time.LocalDate;
import java.util.Random;

public class Product {

    private String productName;
    private int expDay;

    private boolean isFresh;

    private LocalDate produceOn;

    private String placeOfProducts;
    private static Random ran1 = new Random();

    public Product(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
        generateDate();
        setPlace();
        isFresh();
    }

    public void isFresh() {
        int ex = 0;
        if (this.placeOfProducts.equals("Show Case")) {
            ex = this.expDay / 2;
        } else {
            ex = this.expDay;
        }
        if (LocalDate.now().isAfter(this.produceOn.plusDays(ex))) {
            this.isFresh = false;
        } else {
            this.isFresh = true;
        }

    }


    public void generateDate() {
        Random ran = new Random();
        this.produceOn = LocalDate.of(2023, ran.nextInt(8) + 1, ran.nextInt(30) + 1);

    }

    public void setPlace() {
        int num = ran1.nextInt(2);
        if (num == 1) {
            this.placeOfProducts = "Show case";
        } else {
            this.placeOfProducts = "Ice Box";
        }

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getExpDay() {
        return expDay;
    }


    public boolean getIsFresh() {
        return this.isFresh;
    }

    public void setIsFresh() {
        this.isFresh = false;
    }


    public LocalDate getProduceOn() {
        return produceOn;
    }


    public String getPlaceOfProducts() {
        return placeOfProducts;
    }

}
