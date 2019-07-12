package piggyBank;

public class Nickel implements Money
{
    // fields
    private int nickelQuantity;
    private double value = 0.05;

    // constructor
    // Default Constructor for if there isn't a quantity of coins added
    public Nickel()
    {
        this.nickelQuantity = 1;
    }

    // constructor for adding with a quantity of coins
    public Nickel(int nickelQuantity)
    {
        this.nickelQuantity = nickelQuantity;
    }

    // methods
    // Return the value of the specific quantity added
    public double getQuantityValue()
    {
        return nickelQuantity * value;
    }

    // Overrides for methods from Money Interface
    // Returns the quantity of Nickels added
    @Override
    public int getQuantity()
    {
        return nickelQuantity;
    }

    // Returns the value of a Nickel
    @Override
    public double getValue()
    {
        return value;
    }


    // Use an If statement to display either the singular or pluarl form of the coin
    @Override
    public String toString()
    {
        if (nickelQuantity == 1)
        {
            String rtnStr = nickelQuantity + " Nickel";
            return rtnStr;
        } else 
        {
            String rtnStr = nickelQuantity + " Nickels";
            return rtnStr;
        }
    }
}