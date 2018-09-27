package entities;

import javax.persistence.*;

/**
 * Persistent class for the User database table. Class and system entity
 * defining the act of making a review on a sold item.
 */

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@OneToOne(mappedBy = "feedback")
	private Auction auction;
	
	@OneToOne
	@JoinColumn(name = "user")
	private User user;
	
	private String text;
	private Integer sellerRating;
	private Integer productRating;

	public Feedback() {}

	public Feedback(Auction auction, User user, String text, int sellerRating, int productRating) {
		super();
		this.auction = auction;
		this.user = user;
		this.text = text;
		this.sellerRating = sellerRating;
		this.productRating = productRating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getSellerRating() {
		return sellerRating;
	}

	public void setSellerRating(Integer sellerRating) {
		this.sellerRating = sellerRating;
	}

	public Integer getProductRating() {
		return productRating;
	}

	public void setProductRating(Integer productRating) {
		this.productRating = productRating;
	}

}
