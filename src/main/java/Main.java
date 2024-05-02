import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MovieListingApplication mla = new MovieListingApplication();
        hardCodedMovieAddition(mla);
        mla.getMovies().sort(new Sortbyname());

        int c=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please register first with your name and email.");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Email: ");
        String email = scan.next();
        try {
            mla.registerUser(name,email);
        } catch (UserAlreadyExistsException e) {
            throw new RuntimeException(e);
        }

        while(c!=0){

            System.out.print("\nEnter a choice:\n1. See All Movies.\n2. Search Movies(Title,Cast,Category,Favourites).\n3. See Details Personal details and favourite movies.\n4. Add movie to favorites.\n5. Remove movie from favorites.\n0. Exit. \nChoice: ");
            c = scan.nextInt();
            switch (c){
                case 1:

                    for(Movie movie: mla.getMovies()){
                        System.out.println(movie.toString());
                    }
                    break;
                case 2:
                    System.out.print("\nEnter a choice:\n1. By Title\n2. By Cast\n3. By Category\n4. In Favourites(by title) \nChoice: ");
                    int secondC = scan.nextInt();
                    scan.nextLine();
                    String s;
                    switch (secondC){
                        case 1:
                            System.out.print("Enter the title of the movie: ");
                            s = scan.nextLine();
                            ArrayList<Movie> m = new ArrayList<>();
                            for(Movie movie: mla.getMovies()) {
                                if(movie.getTitle().getMovieTitle().equals(s)){
                                    m = mla.searchMoviesByTitle(movie.getTitle());
                                    break;
                                }
                            }
                            for(Movie movie: m){
                                System.out.println(movie.toString());
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
        }
    }

    static class Sortbyname implements Comparator<Movie> {

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getTitle().getMovieTitle().compareTo(o2.getTitle().getMovieTitle());
        }
    }

    public static void hardCodedMovieAddition(MovieListingApplication mla){
        Title title = new Title("Inception");

        ArrayList<Actor> cast = new ArrayList<>();
        cast.add(new Actor("Leonardo DiCaprio"));
        cast.add(new Actor("Joseph Gordon"));
        cast.add(new Actor("Ellen Page"));
        cast.add(new Actor("Tom Hardy"));
        cast.add(new Actor("Cillian Murphy"));


        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("Sci-Fi"));
        categories.add(new Category("Action"));
        categories.add(new Category("Thriller"));

        String date = "2010-07-06";

        int budget = 160000000;
        mla.addMovie(title,cast,categories,date,budget);


        title = new Title("The Shawshank Redemption");

        cast = new ArrayList<>();
        cast.add(new Actor("Tim Robbins"));
        cast.add(new Actor("Morgan Freeman"));
        cast.add(new Actor("Bob Gunton"));
        cast.add(new Actor("William Sadler"));
        cast.add(new Actor("Clancy Brown"));

        categories = new ArrayList<>();
        categories.add(new Category("Drama"));

        date = "1994-09-23";

        budget = 25000000;
        mla.addMovie(title, cast, categories, date, budget);


        title = new Title("Avengers: Endgame");

        cast = new ArrayList<>();
        cast.add(new Actor("Robert Downey Jr."));
        cast.add(new Actor("Chris Evans"));
        cast.add(new Actor("Mark Ruffalo"));
        cast.add(new Actor("Chris Hemsworth"));
        cast.add(new Actor("Scarlett Johansson"));

        categories = new ArrayList<>();
        categories.add(new Category("Superhero"));
        categories.add(new Category("Action"));
        categories.add(new Category("Adventure"));

        date = "2019-04-26";

        budget = 356000000;
        mla.addMovie(title, cast, categories, date, budget);


        title = new Title("The Dark Knight");

        cast = new ArrayList<>();
        cast.add(new Actor("Christian Bale"));
        cast.add(new Actor("Heath Ledger"));
        cast.add(new Actor("Aaron Eckhart"));
        cast.add(new Actor("Michael Caine"));
        cast.add(new Actor("Gary Oldman"));

        categories = new ArrayList<>();
        categories.add(new Category("Superhero"));
        categories.add(new Category("Action"));
        categories.add(new Category("Crime"));
        categories.add(new Category("Thriller"));

        date = "2008-07-18";

        budget = 185000000;
        mla.addMovie(title, cast, categories, date, budget);

        title = new Title("Titanic");

        cast = new ArrayList<>();
        cast.add(new Actor("Leonardo DiCaprio"));
        cast.add(new Actor("Kate Winslet"));
        cast.add(new Actor("Billy Zane"));
        cast.add(new Actor("Kathy Bates"));
        cast.add(new Actor("Frances Fisher"));
        cast.add(new Actor("Gloria Stuart"));
        cast.add(new Actor("Bill Paxton"));

        categories = new ArrayList<>();
        categories.add(new Category("Romance"));
        categories.add(new Category("Drama"));

        date = "1997-12-19";

        budget = 200000000;
        mla.addMovie(title, cast, categories, date, budget);
    }
}
