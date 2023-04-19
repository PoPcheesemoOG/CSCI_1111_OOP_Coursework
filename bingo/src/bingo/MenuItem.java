package bingo;

public interface MenuItem {
	double price = 0;
	String name = "";
	int id = 0;
	
	public double getPrice();
	public void setPrice(double newPrice);
	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);

}
