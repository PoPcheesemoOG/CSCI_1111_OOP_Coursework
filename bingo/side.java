package bingo;

public class side implements MenuItem {
	private double price;
	private String name;
	private int id;
	private String type;
	private char size;
	
	public side(char size, String type, int id, String name, double price){
		this.price = price;
		this.id = id;
		this.name = name;
		this.type = type;
		this.size = size;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
	
}
