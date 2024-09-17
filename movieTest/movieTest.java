package movieTest;

import movie.movie;
import movie.movieItem;

public class movieTest {
    public static void main(String[] args) {
        movie myMovie = new movie();

        movieItem item1 = new movieItem("Inception", "Christopher Nolan");
        movieItem item2 = new movieItem("The Matrix", "lunio Wachowski, Lilly Wachowski");

        myMovie.addmovieItem(item1);
        myMovie.addmovieItem(item2);

        myMovie.printmovieDetails();
    }
}


