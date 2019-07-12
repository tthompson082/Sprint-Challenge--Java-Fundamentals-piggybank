package piggyBank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        // create the piggyBank ArrayList to hold the different coins
        ArrayList<Money> piggyBank = new ArrayList<>();

        // add the coins to the list
        piggyBank.add(newQuarter());
        piggyBank.add(new Dime());
        piggyBank.add(newDollar(5));
    }
}