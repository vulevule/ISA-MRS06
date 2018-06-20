package projekat.demo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Place implements Serializable {

	private static final long serialVersionUID = -3237585465892945619L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String address;

	@Column(nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private PlaceType type;

	@JsonBackReference(value = "arenas")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "place")
	private Set<Arena> arenas;

	@JsonBackReference(value = "projection-place")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "place")
	private Set<Projection> projections;

	@JsonBackReference(value="admins")
	@OneToMany(fetch = FetchType.LAZY, mappedBy="place", cascade=CascadeType.ALL) 
	private Set<PlaceAdmin> admins;

	public Place(String name, String description, String address, PlaceType type, Set<Arena> arenas,
			Set<Projection> projections, Set<PlaceAdmin> admins) {
		super();
		this.name = name;
		this.description = description;
		this.address = address;
		this.type = type;
		this.arenas = arenas;
		this.projections = projections;
		this.admins = admins;
	}
	
	

	public Place(Long id, String name, String description, String address, PlaceType type, Set<Arena> arenas,
			Set<Projection> projections, Set<PlaceAdmin> admins) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.address = address;
		this.type = type;
		this.arenas = arenas;
		this.projections = projections;
		this.admins = admins;
	}



	public Place() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PlaceType getType() {
		return type;
	}

	public void setType(PlaceType type) {
		this.type = type;
	}

	public Set<Arena> getArenas() {
		return arenas;
	}

	public void setArenas(Set<Arena> arenas) {
		this.arenas = arenas;
	}

	public Set<Projection> getProjections() {
		return projections;
	}

	public void setProjections(Set<Projection> projections) {
		this.projections = projections;
	}

	public Set<PlaceAdmin> getAdmins() {
		return admins;
	}

	public void setAdmins(Set<PlaceAdmin> admins) {
		this.admins = admins;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
