package iterator;

import java.util.List;

public class BestSellersCollection implements ProductCollection {
    private List<Product> productList;

    public BestSellersCollection(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public ProductIterator createIterator() {
        return new BestSellersIterator(productList);
    }
}

