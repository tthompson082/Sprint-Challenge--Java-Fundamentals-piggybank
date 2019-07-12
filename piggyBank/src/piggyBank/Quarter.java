package piggyBank;

public class Quarter implements Money
{
    // fields
    private int quarterQuantity;
    private double value = 0.25;

    // constructor
    // Default Constructor for if there isn't a quantity of coins added
    public Quarter()
    {
        this.quarterQuantity = 1;
    }

    // constructor for adding with a quantity of coins
    public Quarter(int quarterQuantity)
    {
        this.quarterQuantity = quarterQuantity;
    }

    // methods
    // Return the value of the specific quantity added
    public double getQuantityValue()
    {
        return quarterQuantity * value;
    }

    // Overrides for methods from Money Interface
    // Returns the quantity of Quarters added
    @Override
    public int getQuantity()
    {
        return quarterQuantity;
    }

    // Returns the value of a Quarter
    @Override
    public double getValue()
    {
        return value;
    }

    // Use an If statement to display either the singular or pluarl form of the coin
    @Override
    public String toString()
    {
        if (quarterQuantity == 1)
        {
            String rtnStr = quarterQuantity + " Quarter";
            return rtnStr;
        } else 
        {
            String rtnStr = quarterQuantity + " Quarters";
            return rtnStr;
        }
    }
}