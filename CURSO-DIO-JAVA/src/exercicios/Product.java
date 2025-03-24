package exercicios;

public class Product {
	
	public String name;
	public float price;
	public int quantity;
	
	
	double totalValueStock() {
		return (double)price*quantity;
	}
	void addProducts(int quantity) {
		this.quantity+=quantity;
	}
	void removeProducts(int quantity) {
		this.quantity-=quantity;		
	}
	public String toString() {
		
		return 	"\nUpdate Remove: "+ name+ ", $" + String.format("%.2f", price)+", " + quantity + " units, $" + totalValueStock();
	}
}
