//Written by Christopher Walls.
import java.util.Comparator;
public class movie {
  
  private String movie_name;
  private String movie_year;
  private int movie_rating;
  private String movie_director;
  private float movie_boxofficegross;
  
  
  public movie(String moviename, String movieyear, int movierating, String moviedirector, float movieboxofficegross) {
    this.movie_name = moviename;
    this.movie_year = movieyear;
    this.movie_rating = movierating;
    this.movie_director = moviedirector;
    this.movie_boxofficegross = (float) movieboxofficegross;
  }
//get methods
  public String getMovie_name() {
    return movie_name;
  }
  
  public String getMovie_year() {
    return movie_year;
  }
  
  public int getMovie_rating() {
    return movie_rating;
  }
  
  public String getMovie_director() {
    return movie_director;
  }
  
  public float getMovie_boxofficegross() {
    return movie_boxofficegross;
  }
  
//toString method
  public String toString() {
    return  "Name: " + movie_name + ", Year: " + movie_year + ", Rating: " + movie_rating + ", Director: " + movie_director + ", Office Gross; " + movie_boxofficegross;
  }
//title comparator
  public static Comparator<movie> TitleComparator = new Comparator<movie>() {
    
    public int compare(movie s1, movie s2) {
      String title1 = s1.getMovie_name().toUpperCase();
      String title2 = s2.getMovie_name().toUpperCase();
      
      return title1.compareTo(title2);
    }};
  
  
  public static Comparator<movie> RatingComparator = new Comparator<movie>() {
    
    public int compare(movie s1, movie s2) {
      int rating1 = s1.getMovie_rating();
      int rating2 = s2.getMovie_rating();
      
      return rating1-rating2;
    }};
  
  
  public static Comparator<movie> GrossComparator = new Comparator<movie>() {
    
    public int compare(movie s1, movie s2) {
      int rating1 = (int) s1.getMovie_boxofficegross();
      int rating2 = (int) s2.getMovie_boxofficegross();
      
      return rating1-rating2;
    }};
  
  
  public static Comparator<movie> DirectorComparator = new Comparator<movie>() {
    
    public int compare(movie s1, movie s2) {
      String title1 = s1.getMovie_director().toUpperCase();
      String title2 = s2.getMovie_director().toUpperCase();
      
      return title1.compareTo(title2);
    }};
}

