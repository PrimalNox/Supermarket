import java.io.*;
import java.util.*;

public class Store {
	
	
		public String name;
		public double amt;
		static ArrayList<Store> saleList = new ArrayList<>();
		public Store(String customerName, double amount) {
			name = customerName;
			amt = amount;
		}
		public static void addSale (String customerName, double amount){
			Store nextCustomer = new Store(customerName, amount);
			saleList.add(nextCustomer);
		}
		public static String nameOfBestCustomer(){
			Store cu = saleList.get(0);
			double maxSale = cu.amt;
			String maxName = cu.name;
			for(int j = 1; j < saleList.size(); j++){
				Store checkCustomer = saleList.get(j);
				double checkSale = checkCustomer.amt;
				if (checkSale > maxSale) {
					maxSale = checkSale;
					maxName = checkCustomer.name;
				}
			}
			return maxName;
		}
	}

