package projekat.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Theater_place_admin")
public class PlaceAdmin extends Admin {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
