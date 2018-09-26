package entities;

import javax.persistence.*;

/**
 * Persistent class for the User database table. Class and system entity
 * defining the act of placing a bid on an item for sale.
 */

@Entity
public class Bid {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne
	@JoinColumn(name = "auction")
	private Auction auction;
	
	@ManyToOne
	private User user;
	
	
	private Double amount;

	public Bid() {
	}

	public Bid(Auction auction, User user, Double amount) {
		super();
		this.auction = auction;
		this.user = user;
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

}
