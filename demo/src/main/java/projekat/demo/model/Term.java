package projekat.demo.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity

public class Term implements Serializable, Comparable<Term> {

	private static final long serialVersionUID = -7156861256132077357L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private Date projectionDate;

	@Column(nullable = false)
	private Time projectionTime;

	@Column(nullable = false)
	private double price;

	@JsonBackReference(value = "arena")
	@ManyToOne(optional = false)
	private Arena arena; // sala u kojoj se odrzava film ili predstava

	@JsonManagedReference(value = "term-projection")
	@ManyToOne(optional = false)
	private Projection projection;

	public Term() {
	}

	public Term(Long id, Date projectionDate, Time projectionTime, double price, Arena arena,
			 Projection projection) {
		super();
		this.id = id;
		this.projectionDate = projectionDate;
		this.projectionTime = projectionTime;
		this.price = price;
		this.arena = arena;
		this.projection = projection;
	}

	public Term(Date projectionDate, Time projectionTime, double price, Arena arena, 
			Projection projection) {
		super();
		this.projectionDate = projectionDate;
		this.projectionTime = projectionTime;
		this.price = price;
		this.arena = arena;
		this.projection = projection;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getProjectionDate() {
		return projectionDate;
	}

	public void setProjectionDate(Date projectionDate) {
		this.projectionDate = projectionDate;
	}

	public Time getProjectionTime() {
		return projectionTime;
	}

	public void setProjectionTime(Time projectionTime) {
		this.projectionTime = projectionTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Arena getArena() {
		return arena;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}

	public Projection getProjection() {
		return projection;
	}

	public void setProjection(Projection projection) {
		this.projection = projection;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int compareTo(Term compTerm) {
		if (getProjectionDate() == null || getProjectionTime() == null || compTerm.getProjectionDate() == null || compTerm.getProjectionTime() == null) {
			return 0;
		}
		
		Date thisDate = new Date(getProjectionDate().getTime() + getProjectionTime().getTime());
		Date compDate = new Date(compTerm.getProjectionDate().getTime() + compTerm.getProjectionTime().getTime());
		
		return thisDate.compareTo(compDate);
	}

}