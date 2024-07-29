

## Observer Design Pattern

Define a one to many dependency b/w objects so that when one object change state, all its dependents are notified and updated automatically.

# Notification System Using Observer Design Pattern

This project implements an out-of-stock product notification system using the Observer Design Pattern. It allows users to receive notifications via email or phone when a product is back in stock.

# Working 

In this system, the `StocksObservable` interface acts as the subject being observed. It notifies its observers, which are implemented as email and phone notification services, whenever the stock count changes





