package entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for the User database table.
 * Class defining the main system user entity.
 */

@Entity
@XmlRootElement
@Table(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L; //Object version control
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String email;
	private String name;
	private String phone;
	
	private ArrayList<Product> products;
	private ArrayList<Bid> bids;
	
	
	public User() {}
	
	public User(String email, String name, String phone) {
		this.email = email;
		this.name = name;
		this.phone = phone;
	}
	
	/**Class services*/
	public float getSellerRating() {
		// TODO create method body
		return 0;
	}
	
	/**Helper methods*/
	private boolean isValidEmail(String email) {
		// TODO create method body
		return false;
	}
	private boolean isValidName(String name) {
		// TODO create method body
		return false;
	}
	private boolean isValidPhone(String phone) {
		// TODO create method body
		return false;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public ArrayList<Bid> getBids() {
		return bids;
	}
	public void setBids(ArrayList<Bid> bids) {
		this.bids = bids;
	}
	
}
