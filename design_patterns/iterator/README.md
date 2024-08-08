# Iterator Design Pattern


The Iterator Design Pattern is a behavioral design pattern that provides a way to access the elements of a collection object sequentially without exposing its underlying representation. 

# E-commerce Product Collection

### Overview

In this example, we demonstrate the use of the Iterator Design Pattern in an e-commerce platform scenario. The platform manages various product collections, such as `New Arrivals` and `Best Sellers`, and we need a uniform way to iterate over these collections regardless of their internal structure.

### Components

1. **Product Class**: A simple class representing a product with a name and a price.

2. **ProductIterator Interface**: Defines the methods for iterating over a collection, such as `hasNext()` and `next()`.

3. **ProductCollection Interface**: Defines a method for creating an iterator (`createIterator()`), which concrete product collections implement.

4. **NewArrivalsCollection and BestSellersCollection**: These classes implement the `ProductCollection` interface and represent different product collections. They each return a specific iterator for their internal product list.

5. **NewArrivalsIterator and BestSellersIterator**: Concrete implementations of the `ProductIterator` interface, responsible for iterating over the products in `NewArrivalsCollection` and `BestSellersCollection`, respectively.

### How It Works

- The `NewArrivalsCollection` and `BestSellersCollection` classes hold lists of `Product` objects.
- Each collection provides an iterator to allow the client code to traverse its products without exposing the internal list or how the products are stored.
- The client code uses (`Test`) these iterators to access the products sequentially, ensuring that the collection's internal structure remains encapsulated.

