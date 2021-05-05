package Entity;

public class Game {
	private int ýd;
	private String name;
	private int price;
	public Game(int id, String name, int price) {
		super();
		ýd = id;
		this.name = name;
		this.price = price;
	}
	
	
	
	public int getId() {
		return ýd;
	}
	public void setId(int id) {
		ýd = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
