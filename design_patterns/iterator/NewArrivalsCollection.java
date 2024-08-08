package iterator;

import java.util.List;

public class NewArrivalsCollection implements ProductCollection{

    List<Product> productList ;

    public NewArrivalsCollection(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public ProductIterator createIterator() {
        return new NewArrivalsIterator(productList);
    }

}
