package entities;

import java.io.Serializable;
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
	private static final long serialVersionUID = 1L; //Object version controll
	
	/**Class variables*/
	//Create elements ids automatically, incremented 1 by 1
	@TableGenerator(
	name = "userTableGenerator", // TODO move to system class?
	allocationSize = 1,
	initialValue = 1)
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="userTableGenerator") //TODO create reference to new system class
	private int id;
	
	private String eMail;
	private String name;
	private String phone;
	private Product[] products;
	private Bid[] bids;
	
	/**Constructor*/
	public User() {}
	public User(String eMail, String name, String phone) {
		this.eMail = eMail;
		this.name = name;
		this.phone = phone;
	}
	
	/**Class services*/
	public float getSellerRating() {
		// TODO create method body
		return 0;
	}
	
	
	/**Helper methods*/
	private boolean isValidEMail(String eMail) {
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

}
