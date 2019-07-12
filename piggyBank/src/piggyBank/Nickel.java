package piggyBank;

public class Nickel implements Money
{
    // fields
    private static int totalNickels = 0;
    private int nickelQuantity;
    public double value = 0.05;

    // constructor
    public Nickel()
    {
        this.nickelQuantity = 1;
        totalNickels += 1;
    }

    public Nickel(int nickelQuantity)
    {
        this.nickelQuantity = nickelQuantity;
        totalNickels += nickelQuantity;
    }

    // methods
    public int getQNickelQuantity()
    {
        return nickelQuantity;
    }

    public double getQuantityValue()
    {
        return nickelQuantity * value;
    }

    @Override
    public double getTotalValue()
    {
        return value * totalNickels;
    }

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