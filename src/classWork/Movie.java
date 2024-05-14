package classWork;

public class Movie {
	private String title;
	private String studio;
	private double rating;

	public Movie() {

		this.title = "wakanda forever";
		this.studio = "Marvel";
		this.rating = 7.2;
	}
	
	
	public Movie(String title, String studio, double rating) {

		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the studio
	 */
	public String getStudio() {
		return studio;
	}
	/**
	 * @param studio the studio to set
	 */
	public void setStudio(String studio) {
		this.studio = studio;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
