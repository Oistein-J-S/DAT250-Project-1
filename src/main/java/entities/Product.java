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
private static final long serialVersionUID = 1L; //Object version controll
	
	/**Class variables*/
	//Create elements ids automatically, incremented 1 by 1
	@TableGenerator(
	name = "productTableGenerator", // TODO move to system class?
	allocationSize = 1,
	initialValue = 1)
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="yourTableGenerator") //TODO create reference to new system class
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
	
	/**Helper methods*/

}