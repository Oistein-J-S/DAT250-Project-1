package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Persistent class for the User database table. Class and system entity
 * defining the act of selling a product.
 */

@Entity(name = "auction")
@XmlRootElement
public class Auction {
	
	/** Variables */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	private Product product;
	
	
	@OneToMany(mappedBy = "auction")
	private List<Bid> bids;
	
	@OneToOne
	private Feedback feedback;

	private Double startingPrice;
	private Double buyoutPrice;
	private Long startTime;
	private Long length;

	/** Constructor */
	public Auction() {
	}

	public Auction(Product product, double startingPrice, double buyoutPrice, long length) {
		this.product = product;
		this.startingPrice = startingPrice;
		this.buyoutPrice = buyoutPrice;
		this.length = length;
		
		this.bids = new ArrayList<>();
	}

	public Auction(Product product, double startingPrice, double buyoutPrice, long startTime, long length) {
		this.product = product;
		this.startingPrice = startingPrice;
		this.buyoutPrice = buyoutPrice;
		this.startTime = startTime;
		this.length = length;
		
		this.bids = new ArrayList<>();
	}

	/** Data services */
	public boolean isPublished() {
		// TODO create method body
		return false;
	}

	public boolean isfinished() {
		// TODO create method body
		return false;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	@XmlTransient
	public List<Bid> getBids() {
		return bids;
	}

	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}
	@XmlTransient
	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public Double getStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(Double startingPrice) {
		this.startingPrice = startingPrice;
	}

	public Double getBuyoutPrice() {
		return buyoutPrice;
	}

	public void setBuyoutPrice(Double buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	};
	
}
