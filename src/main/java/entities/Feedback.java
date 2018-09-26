package entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for the User database table.
 * Class and system entity defining the act of making a review on a sold item.
 */

@Entity
@XmlRootElement
@Table(name="bid")
public class Feedback implements Serializable {
private static final long serialVersionUID = 1L; //Object version control

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Bid bid;
	private String text;
	private int sellerRating;
	private int productRating;

	public Feedback() {}
	
	public Feedback(Bid bid, String text, int sRating, int pRating) {
		this.bid = bid;
		this.text = text;
		this.sellerRating = sRating;
		this.productRating = pRating;
	}

	public Bid getBid() {
		return bid;
	}

	public void setBid(Bid bid) {
		this.bid = bid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getSellerRating() {
		return sellerRating;
	}

	public void setSellerRating(int sellerRating) {
		this.sellerRating = sellerRating;
	}

	public int getProductRating() {
		return productRating;
	}

	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}

}
