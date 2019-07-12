package piggyBank;

public class Penny implements Money
{
    // fields
    private int pennyQuantity;
    private double value = 0.01;

    // constructor
    // Default Constructor for if there isn't a quantity of coins added
    public Penny()
    {
        this.pennyQuantity = 1;
    }

    // constructor for adding with a quantity of coins
    public Penny(int pennyQuantity)
    {
        this.pennyQuantity = pennyQuantity;
    }

    // methods
    // Return the value of the specific quantity added
    public double getQuantityValue()
    {
        return pennyQuantity * value;
    }

    // Overrides for methods from Money Interface
    // Returns the quantity of Pennies added
    @Override
    public int getQuantity()
    {
        return pennyQuantity;
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
        if (pennyQuantity == 1)
        {
            String rtnStr = pennyQuantity + " Penny";
            return rtnStr;
        } else 
        {
            String rtnStr = pennyQuantity + " Pennies";
            return rtnStr;
        }
    }
}