package projekat.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@DiscriminatorValue("Visitor")
public class Visitor extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private boolean activate;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Bid> bids;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Ad> ads;
	
	@JsonManagedReference(value="reservations")
	@OneToMany(fetch = FetchType.LAZY, mappedBy="user", cascade = CascadeType.ALL)
	private Set<Reservation> reservations;

	public Visitor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visitor(String name, String surname, String email, String password, String address, String phone,
			boolean activate, RoleType role, Set<Bid> bids, Set<Ad> ads, Set<Reservation> reservations) {
		super(name, surname, email, password, address, phone, role);
		// TODO Auto-generated constructor stub
		this.activate = activate;
		this.bids = bids;
		this.ads = ads;
		this.reservations = reservations;

	}
	
	
	

	public Visitor(String firstName, String lastName, String email, String password, String address, String phone,
			boolean b, RoleType role) {
		// TODO Auto-generated constructor stub
		super(firstName, lastName, email, password, address, phone, role);
		this.activate = b;
	}

	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}

	public Set<Bid> getBids() {
		return bids;
	}

	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	public Set<Ad> getAds() {
		return ads;
	}

	public void setAds(Set<Ad> ads) {
		this.ads = ads;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

}
