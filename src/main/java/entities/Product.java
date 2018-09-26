package entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for the Product database table.
 * Class defining the sales item system entity.
 */

@Entity
@XmlRootElement
@Table(name="product")
public class Product implements Serializable {
private static final long serialVersionUID = 1L; //Object version control
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String description;
	private String features;
	private String picture;
	private User user;
	
	@OneToMany
	private ArrayList<Auction> auctions;
	
	/**Constructor*/
	public Product() {}
	public Product(String name, String description, String features, String picture, User user) {
		this.name = name;
		this.description = description;
		this.features = features;
		this.picture = picture;
		this.user = user;
		
		this.auctions = new ArrayList<Auction>();
	}

	/**Class services*/
	//Method to collect and concatenate all reviews from all actions connected to the product.
	public String[] productReviews() {
		// TODO create method body
		return null;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<Auction> getAuctions() {
		return auctions;
	}
	public void setAuctions(ArrayList<Auction> auctions) {
		this.auctions = auctions;
	}
	
}