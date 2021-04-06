//Written by Christopher Walls.
import java.util.*;
import java.util.Scanner;
public class MovieDataBase
{
  public static void main(String[]args) throws Exception
  {
    
    ArrayList<movie> moviesList = new ArrayList<movie>();
    Scanner KB = new Scanner(System.in);
    while(true){
      System.out.println("1. Add \n2. Delete \n3. Sort by title \n4.Sort by rating \n5.sort by boxoffice gross \n6.sort by director \n7.exit");
      int choice = KB.nextInt();
      if(choice == 1){ //adding new movie
        KB.nextLine();
        System.out.println("Enter movie name: ");
        String movieName = KB.nextLine();
        
        System.out.println("Enter movie year: ");
        String movieYear = KB.nextLine();
        System.out.println("Enter movie rating: ");
        int rating = KB.nextInt();
        KB.nextLine();
        System.out.println("Enter movie Director: ");
        String director = KB.nextLine();
        System.out.println("Enter movie box office gross: ");
        float gross = KB.nextFloat();
        movie obj = new movie(movieName,movieYear,rating,director,gross);
        moviesList.add(obj);
        
        for(int i=0;i<moviesList.size();i++){
          System.out.println(moviesList.get(i));
        }
        
        
      }
//delete
      else if(choice == 2){
        System.out.println("Enter title name to delete: ");
        String delete = KB.nextLine();
        for(int i=0;i<moviesList.size();i++){
          if(moviesList.get(i).getMovie_name().equals(delete)){
            moviesList.remove(i);
            break;
          }
        }
      }
      else if(choice == 3){ //title
        Collections.sort(moviesList, movie.TitleComparator);
        for(int i=0;i<moviesList.size();i++){
          System.out.println(moviesList.get(i));
        }
      }
      else if(choice == 4){ //rating
        Collections.sort(moviesList, movie.RatingComparator);
        for(int i=0;i<moviesList.size();i++){
          System.out.println(moviesList.get(i));
        }
      }
      else if(choice == 5){ //gross
        Collections.sort(moviesList, movie.GrossComparator);
        for(int i=0;i<moviesList.size();i++){
          System.out.println(moviesList.get(i));
        }
      }
      else if(choice == 6){ //sorting by director
        Collections.sort(moviesList, movie.DirectorComparator);
        for(int i=0;i<moviesList.size();i++){
          System.out.println(moviesList.get(i));
        }
      }
      else{
        System.out.println("Good bye");
        break;
      }
    }
  }
}