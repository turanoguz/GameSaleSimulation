package Entity;

public class Game {
	private int �d;
	private String name;
	private int price;
	public Game(int id, String name, int price) {
		super();
		�d = id;
		this.name = name;
		this.price = price;
	}
	
	
	
	public int getId() {
		return �d;
	}
	public void setId(int id) {
		�d = id;
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
