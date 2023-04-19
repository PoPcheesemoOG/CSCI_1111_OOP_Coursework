package bingo;

public class drink implements MenuItem {
	private double price;
	private String name;
	private int id;
	private char size;
	private String flavor;
	
	public drink(char size, String flavor, double price, int id, String name){
		this.setSize(size);
		this.setFlavor(flavor);
		this.price = price;
		this.id = id;
		this.name = name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " $" + price;
	}

	public char getSize() {
		return this.size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	
}

