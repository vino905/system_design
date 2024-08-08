package iterator;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999);
        Product p2 = new Product("Smartphone", 699);
        Product p3 = new Product("Headphones", 199);

        // New arrivals
        NewArrivalsCollection newArrivals = new NewArrivalsCollection(Arrays.asList(p1, p2));
        ProductIterator newArrivalsIterator = newArrivals.createIterator();

        // Best sellers
        BestSellersCollection bestSellers = new BestSellersCollection(Arrays.asList(p2, p3));
        ProductIterator bestSellersIterator = bestSellers.createIterator();

        System.out.println("New Arrivals:");
        while (newArrivalsIterator.hasNext()) {
            System.out.println(newArrivalsIterator.next());
        }

        System.out.println("\nBest Sellers:");
        while (bestSellersIterator.hasNext()) {
            System.out.println(bestSellersIterator.next());
        }
    }
}
