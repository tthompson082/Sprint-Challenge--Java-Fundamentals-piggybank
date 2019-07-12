package piggyBank;

public class Quarter implements Money
{
    // fields
    private static int totalQuarters = 0;
    private int quarterQuantity;
    public double value = 0.25;

    // constructor
    public Quarter()
    {
        this.quarterQuantity = 1;
        totalQuarters += 1;
    }

    public Quarter(int quarterQuantity)
    {
        this.quarterQuantity = quarterQuantity;
        totalQuarters += quarterQuantity;
    }

    // methods
    public int getQuarterQuantity()
    {
        return quarterQuantity;
    }

    public double getQuantityValue()
    {
        return quarterQuantity * value;
    }

    @Override
    public double getTotalValue()
    {
        return value * totalQuarters;
    }

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