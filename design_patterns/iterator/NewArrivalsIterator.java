package iterator;

import java.util.List;

public class NewArrivalsIterator implements ProductIterator {

    private List<Product> productList;
    private int position = 0;

    public NewArrivalsIterator(List<Product> productList) {
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
