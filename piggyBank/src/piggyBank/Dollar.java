package piggyBank;

public class Dollar
{
    // fields
    private static int totalDollars = 0;
    private int dollarQuantity;
    public double value = 1.00;

    // constructor
    public Dollar(int dollarQuantity)
    {
        this.dollarQuantity = dollarQuantity;
        totalDollars += dollarQuantity;
    }

    // methods
    public int getDollarQuantity()
    {
        return dollarQuantity;
    }

    public double getQuantityValue()
    {
        return dollarQuantity * value;
    }

    public double getTotalValue()
    {
        return value * totalDollars;
    }

    @Override
    public String toString()
    {
        String rtnStr = "$" + dollarQuantity;
        return rtnStr;
    }
}