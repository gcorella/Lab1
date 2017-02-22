import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double work = 0;
		double rrate = 0;
		double yr = 0;
		double ap = 0;
		double ssii = 0;
		double monthly = 0;
		double total = 0;
		double reqIncome = 0;

		// Formulas:
		// What you need saved:
		// total =
		// (reqIncome-ssii)*((1-(1/(Math.pow(1+(rrate/100)/12,yr*12)))))/((rrate/100)/12);

		// Formula to save every month
		// monthly = total*(((rrate/100)/12)/((Math.pow(1+(rrate/100)/12,
		// work*12))-1));

		// Ask how long they are expecting to work
		try {
			System.out.println("How many years do you plan on working?: ");
			work = input.nextDouble();
		} catch (Exception ex) {
			System.out.println("Please enter a number in whole years");
			work = input.nextDouble();
		}

		// Ask what there expected annual return rate is
		try {
			System.out.println("What is your return rate? ");
			rrate = input.nextDouble();
		} catch (Exception ex) {
			System.out.println("Please enter the rate as a decimal number");
			rrate = input.nextDouble();
		}

		// How long do you want to be in retirement?
		try {
			System.out.println("How long do you want to be in retirement? ");
			yr = input.nextDouble();
		} catch (Exception ex) {
			System.out.println("Please enter in numbers how many years you would like to be in retirement:");
			yr = input.nextDouble();
		}

		// Asks What is the annual return on your payback
		try {
			System.out.println("What is your annual return on your payback? ");
			ap = input.nextDouble();
		} catch (Exception ex) {
			System.out.println("Please enter the percent of your annual return rate as a decimal");
			ap = input.nextDouble();
		}

		// Asks What is your required income?
		try {
			System.out.println("What is your required income");
			reqIncome = input.nextDouble();
		} catch (Exception ex) {
			System.out.println("Please enter your income asa whole number");
			reqIncome = input.nextDouble();
		}

		// Asks the user what their expected SSI income is
		try {
			System.out.println("What is your estimated or expected SSI income?");
			ssii = input.nextDouble();
		} catch (Exception ex) {
			System.out.println(" Please enter the expected SSI as a whole number in  terms of dollars");
			ssii = input.nextDouble();
		}
		total = (reqIncome - ssii) * ((1 - (1 / (Math.pow(1 + (ap / 100) / 12, yr * 12))))) / ((ap / 100) / 12);

		monthly = total * (((rrate / 100) / 12) / ((Math.pow(1 + (rrate / 100) / 12, work * 12)) - 1));

		System.out.format("You need to save $%.2f a month for a total of $%.2f saved.", monthly, total);
		input.close();

	}

}