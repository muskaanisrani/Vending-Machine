import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String userinput="0";
		Vendingmachine trynew=new Vendingmachine();
		while ((userinput.compareTo("Q"))!=0) {
			System.out.println("S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit ");
			userinput=sc.next();
			if (userinput.equals("S") || userinput.equals("s")) {
				System.out.println(trynew.toString());
			} else {
				if(userinput.equals("I") || userinput.equals("i")) {
					System.out.println("A) nickel @ 0.05");
					System.out.println("B) dime @ 0.1");
					System.out.println("C) quarter @ 0.25");
					System.out.println("D) dollar @ 1.0");
					String userchoiceI=sc.next();
					System.out.print("How many coins would you like to insert?");
					int userchoiceII=sc.nextInt();
					if (userchoiceI.equals("A") || userchoiceI.equals("a")) {
						trynew.insertCoin("nickel", userchoiceII);	
					}  else {
						if (userchoiceI.equals("B") || userchoiceI.equals("b")) {
							trynew.insertCoin("dime", userchoiceII);
						} else {
							if(userchoiceI.equals("C") || userchoiceI.equals("c")) {
								trynew.insertCoin("quarter", userchoiceII);
							} else {
								if (userchoiceI.equals("D") || userchoiceI.equals("d")) {
									trynew.insertCoin("dollar", userchoiceII);
								}
							}
						}
					}
					
				} else {
					if (userinput.equals("B")|| userinput.equals("b")) {
						trynew.buyProduct();
					} else {
						if (userinput.equals("A")|| userinput.equals("a")) {
							System.out.println("enter name of the product");
							String nameofprod=sc.next();
							System.out.println("enter the price");
							double priceofprod=sc.nextDouble();
							System.out.println("enter the quantity");
							int quantityofprod=sc.nextInt();
							trynew.addProduct(nameofprod,priceofprod,quantityofprod);
						} else {
							if (userinput.equals("R")|| userinput.equals("r")) {
								System.out.print(trynew.removecoin());
							} else {
								break;
							}
						}
					}
				}
			}
		}		
	}
}
