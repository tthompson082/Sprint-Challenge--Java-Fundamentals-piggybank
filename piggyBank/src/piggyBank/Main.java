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

        // print out each added coin to the console
        piggyBank.forEach(m -> System.out.println(m));

        // initially set myValue
        double myValue = 0.00;

        // loop through piggyBank adding the values of each individual quantity of coins to myValue
        for (int i = 0; i < piggyBank.size(); i++)
        {
            myValue += piggyBank.get(i).getQuantityValue();
        }

        // print out the total value of piggyBank
        System.out.println("The piggy bank holds " + fp.format(myValue));

        // ************* STRETCH (WIP) ********************
        int totalDollars = 0;
        int totalQuarters = 0;
        int totalDimes = 0;
        int totalNickels = 0;
        int totalPennies = 0;

        for (int i = 0; i < piggyBank.size(); i++)
        {
            if (piggyBank.get(i).getValue() == 1.00)
            {
                totalDollars += piggyBank.get(i).getQuantity();
            } else if (piggyBank.get(i).getValue() == 0.25)
            {
                totalQuarters += piggyBank.get(i).getQuantity();
            } else if (piggyBank.get(i).getValue() == 0.10)
            {
                totalDimes += piggyBank.get(i).getQuantity();
            } else if (piggyBank.get(i).getValue() == 0.05)
            {
                totalNickels += piggyBank.get(i).getQuantity();
            } else if (piggyBank.get(i).getValue() == 0.01)
            {
                totalPennies += piggyBank.get(i).getQuantity();
            }
        }
    }
}