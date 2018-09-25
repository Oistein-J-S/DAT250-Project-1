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
private static final long serialVersionUID = 1L; //Object version controll
	
	/**Class variables*/
	//Create elements ids automatically, incremented 1 by 1
	@TableGenerator(
	name = "feedbackTableGenerator", // TODO move to system class?
	allocationSize = 1,
	initialValue = 1)
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="yourTableGenerator") //TODO create reference to new system class
	private int id;
	
	private Bid bid;
	private String feedback;
	private int sellerRating;
	private int productRating;
	
	/**Constructor*/
	public Feedback() {}
	public Feedback(Bid bid, String feedback, int sRating, int pRating) {
		this.bid = bid;
		this.feedback = feedback;
		this.sellerRating = sRating;
		this.productRating = pRating;
	}

	/**Class services*/
	
	
	/**Helper methods*/

}
