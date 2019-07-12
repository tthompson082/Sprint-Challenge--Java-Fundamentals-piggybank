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
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach(m -> System.out.println(m));

        double myValue = 0.00;
        for (int i = 0; i < piggyBank.size(); i++)
        {
            myValue += piggyBank.get(i).getQuantityValue();
        }

        System.out.println("The piggy bank holds " + fp.format(myValue));
    }
}