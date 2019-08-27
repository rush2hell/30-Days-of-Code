import java.util.*;
class Operators
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double mealCost = sc.nextDouble();
		int tipPercent = sc.nextInt();
		int taxPercent = sc.nextInt();
		double tip = 0.0,tax = 0.0;
		double totalCost=0.0; 
		tip = (mealCost*tipPercent/100);
		tax = (mealCost*taxPercent/100);
		totalCost = mealCost+tip+tax;
		System.out.println(Math.round(totalCost));
	}
}