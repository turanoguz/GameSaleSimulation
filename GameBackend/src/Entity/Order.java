package Entity;

public class Order {
	private int ýd;
	private Customer customer;
	private Game game;
	private Campaign campaign;
	boolean Coupon;
	public Order(int id, Customer customer, Game game, Campaign campaign) {
		ýd = id;
		this.customer = customer;
		this.game = game;
		this.campaign = campaign;
		
	}
	
	public Order(int id, Customer customer, Game game) {
		
		ýd = id;
		this.customer = customer;
		this.game = game;
	}

	
	public int getId() {
		return ýd;
	}
	public void setId(int id) {
		ýd = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	

}
