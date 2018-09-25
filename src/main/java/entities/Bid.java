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
private static final long serialVersionUID = 1L; //Object version controll
	
	/**Class variables*/
	//Create elements ids automatically, incremented 1 by 1
	@TableGenerator(
	name = "bidTableGenerator", // TODO move to system class?
	allocationSize = 1,
	initialValue = 1)
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="yourTableGenerator") //TODO create reference to new system class
	private int id;
	
	private User user;
	private Double amount;
	private Auction auction;
	private Feedback feedback;
	
	/**Constructor*/
	public Bid() {}
	public Bid(User user, Double amount, Auction auction) {
		this.user = user;
		this.amount = amount;
		this.auction = auction;
	}

	/**Class services*/
	public void giveFeedback(String review, int productRating, int sellerRating) {
		// TODO create method body
	}
	public void giveFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
	/**Helper methods*/
}
