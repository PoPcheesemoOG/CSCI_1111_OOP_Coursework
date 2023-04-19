package bingo;

public class burger implements MenuItem {
	private double price;
	private String name;
	private int id;
	private boolean cheese;
	private int stack;
	
	public burger(int stack, boolean cheese, int id, String name, double price){
		this.price = price;
		this.id = id;
		this.name = name;
		this.stack = stack;
		this.cheese = cheese;
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

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public int getStack() {
		return stack;
	}

	public void setStack(int stack) {
		this.stack = stack;
	}
}
