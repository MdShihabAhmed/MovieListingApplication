import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
    private Title title;
    private ArrayList<Actor> cast;
    private ArrayList<Category> categories;
    private LocalDate releaseDate;
    private int budget;//as the budget won't be in decimals


    public Movie(Title title,String date, int budget){
        this.title=title;
        this.cast = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.releaseDate =LocalDate.parse(date);//'date' has to be in specific string format("2018-05-05")
        this.budget = budget;
    }

    public Title getTitle() {
        return title;
    }

    public void addActorToCast(Actor actor){
        cast.add(actor);
    }

    public void addActorsToCast(ArrayList<Actor> actors){
        cast.addAll(actors);
    }

    public ArrayList<Actor> getCast(){
        return cast;
    }

    public void addCategory(Category category){
        categories.add(category);
    }
    public void addCategories(ArrayList<Category> categories){
        this.categories.addAll(categories);
    }

    public ArrayList<Category> getCategories(){
        return categories;
    }

    public LocalDate getReleaseDate(){
        return releaseDate;
    }

    public int getBudget(){
        return budget;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title=" + title +
                ", cast=" + cast +
                ", categories=" + categories +
                ", releaseDate=" + releaseDate +
                ", budget=" + budget +
                '}';
    }
}
