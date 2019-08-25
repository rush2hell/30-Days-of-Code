import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		//read 3 inputs
		int input1 = Integer.parseInt(scan.nextLine());
		double input2 = Double.parseDouble(scan.nextLine());
		String text = scan.nextLine();

		//using + operator
		System.out.println(i+input1);
		System.out.println(d+input2);
		System.out.println(s+text);
	}
}