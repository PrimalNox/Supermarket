import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		do {
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Please enter the name of the Customer. (\"Exit\" to abort)");
			name = kbReader.nextLine();
			if (!name.equalsIgnoreCase("EXIT")) {
				System.out.print("Please enter the amount of the sale.");
				Double sale = kbReader.nextDouble();
				System.out.println(" ");
				Store.addSale(name, sale);
			}
		} while (!name.equalsIgnoreCase("EXIT"));
		System.out.println("The best customer of the day is " + Store.nameOfBestCustomer() + ".");

	}
}
