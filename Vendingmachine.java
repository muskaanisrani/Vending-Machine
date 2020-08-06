import java.util.ArrayList;
import java.util.Scanner;
public class Vendingmachine {
	private ArrayList<Product> products;
	private double moneyCollected;
	private double currenttrans;
	
	public Vendingmachine(){
		products= new ArrayList<Product>();
		moneyCollected=0.0;
		
	}
	public void addProduct(String name,double price,int quantity) {
		Product toadd=new Product(name,price,quantity);
		products.add(toadd);				
	}
	public String toString() {
		String answer="";
		for (int i=0;i<=products.size()-1;i++) {
			answer=(i)+products.get(i).toString()+"\n"+answer;
					
		}
		return answer;
	}

	public void insertCoin(String type,int quantity){
		double value=0.0;
		
		if (type.equals("nickel")) {
			value=0.05;
		} else {
			if (type.equals("dime")) {
				value=0.1;
			} else {
				if (type.equals("quarter")) {
					value=0.25;
				} else {
					if (type.equals("dollar")){
						value=1.0;
					}
				}
			}
		}		
		currenttrans=currenttrans+value*quantity;
	}
	
	public void buyProduct() {
		Scanner sc=new Scanner(System.in);
		if (products.isEmpty()==true) {
			System.out.print("Sorry there are no products");
			
		} else {
			System.out.println(toString());
			System.out.print("Which product would you like? ");
			int ans=sc.nextInt();
			double tempo=products.get(ans).getprice();
			if (currenttrans>=tempo) {
				System.out.println("purchased"+products.get(ans).toString());
				double tempo2= moneyCollected-products.get(ans).getprice();
				System.out.println("your change:"+tempo2);
				moneyCollected=moneyCollected+tempo;
				int current=products.get(ans).getquantity();
				if (current>1) {
					products.get(ans).setquantity(current-1);
				} else {
					products.remove(ans);
				}
			} else {
				System.out.println("insufficient funds");
			}
			
		}
		
		
	}
	
	public String removecoin() {
		double temp=moneyCollected;
		moneyCollected=0.0;
		return "Removed"+temp;
		
	}
	
	
}
