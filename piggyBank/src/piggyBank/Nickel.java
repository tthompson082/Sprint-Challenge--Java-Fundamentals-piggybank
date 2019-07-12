package piggyBank;

public class Nickel
{
    // fields
    private static int totalNickels = 0;
    private int nickelQuantity;
    public double value = 0.05;

    // constructor
    public Nickel(int nickelQuantity)
    {
        this.nickelQuantity = nickelQuantity;
        totalQuarters += nickelQuantity;
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
        } else 
        {
            String rtnStr = nickelQuantity + " Nickels";
        }
        return rtnStr;
    }
}