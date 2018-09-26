package entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for the User database table.
 * Class and system entity defining the act of placing a bid on an item for sale.
 */

@Entity
@XmlRootElement
@Table(name="bid")
public class Bid implements Serializable {
private static final long serialVersionUID = 1L; //Object version control

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Auction auction;
	private User user;
	private Double amount;

	public Bid() {}
	
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
