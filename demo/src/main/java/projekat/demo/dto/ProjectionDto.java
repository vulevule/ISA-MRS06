package projekat.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;

import projekat.demo.model.ProjectionType;

public class ProjectionDto implements Serializable {

	private static final long serialVersionUID = 1781494581374828651L;
	
	private long id;
	private String name;
	private ProjectionType type;
	private String cast;
	private String genre;
	private String director;
	private int duration;
	private String banner;
	private int numOfVisitors;
	private double averageRating;
	private String description;

	private ArrayList<TermDto> terms;

	public ProjectionDto(String name, ProjectionType type, String cast, String genre, String director, int duration,
			String banner, int numOfVisitors, double averageRating, String description, ArrayList<TermDto> terms) {
		super();
		this.name = name;
		this.type = type;
		this.cast = cast;
		this.genre = genre;
		this.director = director;
		this.duration = duration;
		this.banner = banner;
		this.numOfVisitors = numOfVisitors;
		this.averageRating = averageRating;
		this.description = description;
		this.terms = terms;
	}
	
	

	public ProjectionDto(long id, String name, ProjectionType type, String cast, String genre, String director,
			int duration, String banner, int numOfVisitors, double averageRating, String description,
			ArrayList<TermDto> terms) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cast = cast;
		this.genre = genre;
		this.director = director;
		this.duration = duration;
		this.banner = banner;
		this.numOfVisitors = numOfVisitors;
		this.averageRating = averageRating;
		this.description = description;
		this.terms = terms;
	}

	public ProjectionDto() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProjectionType getType() {
		return type;
	}

	public void setType(ProjectionType type) {
		this.type = type;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public int getNumOfVisitors() {
		return numOfVisitors;
	}

	public void setNumOfVisitors(int numOfVisitors) {
		this.numOfVisitors = numOfVisitors;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<TermDto> getTerms() {
		return terms;
	}

	public void setTerms(ArrayList<TermDto> terms) {
		this.terms = terms;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
