package model.entities;

public class Product {

	String name;
	double price;
	int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + ", ");
		sb.append(getPrice() + ", ");
		sb.append(getQuantity());
		return sb.toString();

	}
	
	public Double totalPrice() {
		return getPrice() * getQuantity();
	}
	
}