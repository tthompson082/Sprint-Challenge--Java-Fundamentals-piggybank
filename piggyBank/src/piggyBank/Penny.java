package piggyBank;

public class Penny
{
    // fields
    private static int totalPennies = 0;
    private int pennyQuantity;
    public double value = 0.01;

    // constructor
    public Penny(int pennyQuantity)
    {
        this.pennyQuantity = pennyQuantity;
        totalPennies += pennyQuantity;
    }

    // methods
    public int getPennyQuantity()
    {
        return pennyQuantity;
    }

    public double getQuantityValue()
    {
        return pennyQuantity * value;
    }

    public double getTotalValue()
    {
        return value * totalPennies;
    }

    @Override
    public String toString()
    {
        if (pennyQuantity == 1)
        {
            String rtnStr = pennyQuantity + " Penny";
        } else 
        {
            String rtnStr = pennyQuantity + " Pennies";
        }
        return rtnStr;
    }
}