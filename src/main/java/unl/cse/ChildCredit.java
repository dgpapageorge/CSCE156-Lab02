package unl.cse;

import java.util.ArrayList;
import java.util.List;

/**
 * This program produces a report on how much a a tax payer can expect for their
 * child tax credits.
 * 
 * @author dpapageorge
 *
 */
public class ChildCredit {

	/**
	 * Produces a string report of how much
	 * of a credit each child receives as well as a grand total.
	 * 
	 * Returns the total of credit.
	 * 
	 * @param kids
	 * @return report
	 */
	public static int produceReport(List<Child> kids) {
		System.out.printf("%-19s %-5s","Child","Amount\n");
		int amount = 0;
		int first = 0;
		int total = 0;
		for (int i = 0;i<kids.size();i++)
		{
			if (kids.get(i).getAge() >= 18)
			{
				amount = 0;
			}
			else if (first == 0)
			{
				amount = 1000;
				first = 1;
			}
			else
			{
				amount = 500;
			}
			total += amount;
			
			System.out.printf("%-20s %-5s","\n"+kids.get(i).getName()+" ("+kids.get(i).getAge()+")","$"+amount);
		}
		System.out.printf("%-20s %-5s","\nTotal Credit: ","$"+total);
		return total;

	}

	public static void main(String args[]) {

		Child tom = new Child("Tommy", 14);
		Child dick = new Child("Richard", 12);
		Child harry = new Child("Harold", 21);

		// A list of children above:
		List<Child> kids = new ArrayList<>();
		kids.add(tom);
		kids.add(dick);
		kids.add(harry);

		produceReport(kids);

	}
}
