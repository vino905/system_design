package iterator;

import java.util.List;

public class BestSellersIterator implements ProductIterator {

    private List<Product> productList;
    private int position = 0;

    public BestSellersIterator(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean hasNext() {
        return position < productList.size();
    }

    @Override
    public Product next() {
        return productList.get(position++);
    }
}
