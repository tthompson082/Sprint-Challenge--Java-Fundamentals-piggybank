package piggyBank;

public class Dollar implements Money
{
    // fields
    private int dollarQuantity;
    private double value = 1.00;

    // constructor
    // Default Constructor for if there isn't a quantity of coins added
    public Dollar()
    {
        this.dollarQuantity = 1;
    }

    // constructor for adding with a quantity of coins
    public Dollar(int dollarQuantity)
    {
        this.dollarQuantity = dollarQuantity;
    }

    // methods
    // Return the value of the specific quantity added
    public double getQuantityValue()
    {
        return dollarQuantity * value;
    }

    // Updates the specific quantity added (added for STRETCH)
    public void setQuantity(int dollarQuantity)
    {
        this.dollarQuantity = dollarQuantity;
    }

    // Overrides for methods from Money Interface
    // Returns the quantity of Dollars added
    @Override
    public int getQuantity()
    {
        return dollarQuantity;
    }

    // Returns the value of a Dollar
    @Override
    public double getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        String rtnStr = "$" + dollarQuantity;
        return rtnStr;
    }
}