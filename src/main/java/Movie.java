import java.util.ArrayList;

public class Movie {
    private Title title;
    private ArrayList<Cast> casts;


    public Movie(Title title){
        this.title=title;
        casts = new ArrayList<>();
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

}
