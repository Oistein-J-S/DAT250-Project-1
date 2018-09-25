package entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for the User database table.
 * Class and system entity defining the act of selling a product.
 */

@Entity
@XmlRootElement
@Table(name="auction")
public class Auction implements Serializable {
private static final long serialVersionUID = 1L; //Object version controll
	
	/**Class variables*/
	//Create elements ids automatically, incremented 1 by 1
	@TableGenerator(
	name = "auctionTableGenerator", // TODO move to system class?
	allocationSize = 1,
	initialValue = 1)
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="yourTableGenerator") //TODO create reference to new system class
	private int id;
	
	private Product product;
	private Bid currentBid;
	private double startingPrice;
	private double buyoutPrice;
	private long startTime;
	private long length;
	
	/**Constructor*/
	public Auction() {}
	public Auction(Product product, double startingPrice, double buyoutPrice, long length) {
		this.product = product;
		this.startingPrice = startingPrice;
		this.buyoutPrice = buyoutPrice;
		this.length = length;
	}
	public Auction(Product product, double startingPrice, double buyoutPrice, long startTime, long length) {
		this.product = product;
		this.startingPrice = startingPrice;
		this.buyoutPrice = buyoutPrice;
		this.startTime = startTime;
		this.length = length;
	}
	
	/**Class services*/
	public boolean isPublished() {
		// TODO create method body
		return false;
	}
	
	public boolean isfinished() {
		// TODO create method body
		return false;
	};
	
	// Method to acept bit to be verified as new currentBid
	// Thread safety may an issue in this method?
	public boolean makeBid(Bid bid) {
		// TODO create method body
		return false;
	}
	
	/**Helper methods*/

	
}
