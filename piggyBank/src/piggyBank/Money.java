package piggyBank;

// Add an interface to be able to add each individual coin to the same ArrayList in Main.java
public interface Money
{
    // Methods to be passed down to each Coin Class
    // Get the value of a specific quantity of coins added
    double getQuantityValue();
    // Get the quantity of how many coins were added at a time
    int getQuantity();
    // Get the value of a specific type of coin
    double getValue();
}