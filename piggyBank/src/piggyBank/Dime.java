package piggyBank;

public class Dime implements Money
{
    // fields
    private int dimeQuantity;
    private double value = 0.10;

    // constructor
    // Default Constructor for if there isn't a quantity of coins added
    public Dime()
    {
        this.dimeQuantity = 1;
    }

    // constructor for adding with a quantity of coins
    public Dime(int dimeQuantity)
    {
        this.dimeQuantity = dimeQuantity;
    }

    // methods
    // Return the value of the specific quantity added
    public double getQuantityValue()
    {
        return dimeQuantity * value;
    }

    // Overrides for methods from Money Interface
    // Returns the quantity of Dimes added
    @Override
    public int getQuantity()
    {
        return dimeQuantity;
    }

    // Returns the value of a Dime
    @Override
    public double getValue()
    {
        return value;
    }

    // Use an If statement to display either the singular or pluarl form of the coin
    @Override
    public String toString()
    {
        if (dimeQuantity == 1)
        {
            String rtnStr = dimeQuantity + " Dime";
            return rtnStr;
        } else 
        {
            String rtnStr = dimeQuantity + " Dimes";
            return rtnStr;
        }
    }
}