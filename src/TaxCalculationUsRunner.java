import java.util.Scanner;

public class TaxCalculationUsRunner {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        System.out.print("Are you married? (Y/N) ");
        String input = in.next();

        int status;
        if (input.equals("Y"))
        {
            status = Constants.MARRIED;
        }
        else{
            status = Constants.SINGLE;
        }

        TaxReturnUs aTaxReturn = new TaxReturnUs(income, status);
        System.out.println("Tax: " + aTaxReturn.getTax());

    }
}



