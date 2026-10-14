import java.util.Scanner;
import java.text.DecimalFormat;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int modalTotal = (x * 6) + (y * 2);
		int grossTotal = (x * 8) + (y * 5);
		int totalProfit = grossTotal - modalTotal;
		
		DecimalFormat df = new DecimalFormat ("0.00");
		System.out.println("RM" + df.format (totalProfit));
		
		input.close();

	}

}
