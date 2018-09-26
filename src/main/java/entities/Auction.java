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
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Product product;
	private Bid currentBid;
	private Feedback feedback;
	
	private double startingPrice;
	private double buyoutPrice;
	private long startTime;
	private long length;
	
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Bid getCurrentBid() {
		return currentBid;
	}

	public void setCurrentBid(Bid currentBid) {
		this.currentBid = currentBid;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public double getStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(double startingPrice) {
		this.startingPrice = startingPrice;
	}

	public double getBuyoutPrice() {
		return buyoutPrice;
	}

	public void setBuyoutPrice(double buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}
	
}
