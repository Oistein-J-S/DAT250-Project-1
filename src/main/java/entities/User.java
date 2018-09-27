package entities;

import java.util.ArrayList;

import javax.persistence.*;

/**
 * Persistent class for the User database table. Class defining the main system
 * user entity.
 */

@Entity(name = "\"USER\"")
public class User {
	
	/** Variables */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String email;
	private String name;
	private String phone;

	@OneToMany(mappedBy = "user")
	private ArrayList<Product> products;
	
	@OneToMany(mappedBy = "user")
	private ArrayList<Bid> bids;

	/** Constructors */
	public User() {}

	public User(String email, String name, String phone) {
		this.email = email;
		this.name = name;
		this.phone = phone;
		
		this.products = new ArrayList<Product>();
		this.bids = new ArrayList<Bid>();
	}
	
	/** Data services */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
