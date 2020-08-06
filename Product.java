/*Muskan Israni
 * 017537908
 * CECS 277 LAB 4
 */
public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(){
		name="";
		price=0.0;
		quantity=0;
	}
	public Product(String n,double p,int q) {
		name=n;
		price=p;
		quantity=q;
	}
	public void setname(String a){
		name=a;
	}
	public String getname(){
		return name;
	}
	public void setprice(double p) {
		price=p;
	}
	public double getprice(){
		return price;
	}
	public void setquantity(int q) {
		quantity=q;
	}
	public int getquantity(){
		return quantity;
	}
	public String toString() {
		return name+"@"+price;
	}

}
