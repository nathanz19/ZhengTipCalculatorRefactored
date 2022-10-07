import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Inputs
        System.out.println("Welcome to tip calculator!");
        System.out.print("How many people are in your group?: ");
        int numOfPpl = s.nextInt();
        System.out.print("What is your tip percentage? (0-100): ");
        int tipPercent = s.nextInt();
        System.out.print("Enter a cost in dollars and cents of your meal: ");
        double mealCost = s.nextDouble();
        System.out.println("_________________________________________");

        //Constructor In Use
        TipCalculator meal1 = new TipCalculator(numOfPpl , tipPercent);
        meal1.addMeal(mealCost);
        System.out.println("Total Bill Before Tip: " + meal1.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + meal1.getTipPercentage());
        System.out.println("Total Tips: " + ((int)(meal1.tipAmount()*100))/100.0);
        System.out.println("Total Bill With Tip: " + ((int)(meal1.totalBill()*100))/100.0);
        System.out.println("Per Person Cost Before Tip: " + ((int)(meal1.perPersonCostBeforeTip()*100))/100.0);
        System.out.println("Tip Per Person: " + ((int)(meal1.perPersonTipAmount()*100))/100.0);
        System.out.println("Total Cost Per Person " + ((int)(meal1.perPeronTotalCost()*100))/100.0);

    }
}
