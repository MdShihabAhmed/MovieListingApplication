import java.util.ArrayList;

public class Movie {
    private Title title;
    private ArrayList<Cast> casts;
    private ArrayList<Category> categories;


    public Movie(Title title){
        this.title=title;
        casts = new ArrayList<>();
        categories = new ArrayList<>();
    }

    public Title getTitle() {
        return title;
    }

    public void addCast(Cast cast){
        casts.add(cast);
    }

    public ArrayList<Cast> getCasts(){
        return casts;
    }

    public void addCategory(Category category){
        categories.add(category);
    }

    public ArrayList<Category> getCategories(){
        return categories;
    }

}
