package piggyBank;

public class Dime
{
    // fields
    private static int totalDimes = 0;
    private int dimeQuantity;
    public double value = 0.10;

    // constructor
    public Dime(int dimeQuantity)
    {
        this.dimeQuantity = dimeQuantity;
        totalDime += dimeQuantity;
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

    public double getTotalValue()
    {
        return value * totalDimes;
    }

    @Override
    public String toString()
    {
        if (DimeQuantity == 1)
        {
            String rtnStr = dimeQuantity + " Dime";
        } else 
        {
            String rtnStr = dimeQuantity + " Dimes";
        }
        return rtnStr;
    }
}