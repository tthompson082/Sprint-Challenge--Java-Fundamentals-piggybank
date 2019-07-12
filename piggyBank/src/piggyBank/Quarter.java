package piggyBank;

public class Quarter
{
    // fields
    private static int totalQuarters = 0;
    private int quarterQuantity;
    public double value = 0.25;

    // constructor
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
        } else 
        {
            String rtnStr = quarterQuantity + " Quarters";
        }
        return rtnStr;
    }
}