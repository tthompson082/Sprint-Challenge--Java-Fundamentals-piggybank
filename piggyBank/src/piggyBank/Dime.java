package piggyBank;

public class Dime implements Money
{
    // fields
    private static int totalDimes = 0;
    private int dimeQuantity;
    public double value = 0.10;

    // constructor
    public Dime()
    {
        this.dimeQuantity = 1;
        totalDimes += 1;
    }

    public Dime(int dimeQuantity)
    {
        this.dimeQuantity = dimeQuantity;
        totalDimes += dimeQuantity;
    }

    // methods
    public int getDimeQuantity()
    {
        return dimeQuantity;
    }

    public double getQuantityValue()
    {
        return dimeQuantity * value;
    }

    @Override
    public double getTotalValue()
    {
        return value * totalDimes;
    }

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