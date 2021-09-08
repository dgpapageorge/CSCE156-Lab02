package unl.cse;

/**
 * This program demonstrates the use of various loop control structures to
 * compute the sum of natural numbers.
 * 
 * @author dpapageorge
 *
 */
public class Natural {

	/**
	 * Computes the sum of natural numbers 1..n using a while loop.
	 * 
	 * @return
	 */
	public static int sumWithWhile(int n) {
		int flag = 0;
		int sum = 0;
		while (flag <= n)
		{
			sum+=flag;
			flag++;
		}
		return sum;
	}

	/**
	 * Computes the sum of natural numbers 1..n using a for loop.
	 * 
	 * @return
	 */
	public static int sumWithFor(int n) {
		int sum = 0;
		for (int i = 0; i<=n;i++)
		{
			sum += i;
		}
		return sum;
	}

	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("ERROR: expecting a single integer argument");
			System.exit(1);
		}

		Integer n = null;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException nfe) {
			System.err.println("ERROR: expecting a single integer argument");
			System.exit(1);
		}
		
		String zeroToTen[] = new String[11];
		zeroToTen[0] = "zero";
		zeroToTen[1] = "one";
		zeroToTen[2] = "two";
		zeroToTen[3] = "three";
		zeroToTen[4] = "four";
		zeroToTen[5] = "five";
		zeroToTen[6] = "six";
		zeroToTen[7] = "seven";
		zeroToTen[8] = "eight";
		zeroToTen[9] = "nine";
		zeroToTen[10] = "ten";

		String line = "";
		for (String s: zeroToTen)
		{
			line += s;
			if (s != "ten")
			{
				line+=" + ";
			}
		}
		line += " = "+sumWithFor(10);
		System.out.println(line);
	}
}
