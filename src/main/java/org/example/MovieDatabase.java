package org.example;

import java.util.ArrayList;

public class MovieDatabase {

    public static ArrayList<Movie> getMovies() {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", "Sci-Fi", 8.8));
        movies.add(new Movie("Interstellar", "Sci-Fi", 8.6));
        movies.add(new Movie("The Dark Knight", "Action", 9.0)); 
        movies.add(new Movie("Avengers: Endgame", "Action", 8.4));
        movies.add(new Movie("3 Idiots", "Comedy", 8.4));
        movies.add(new Movie("Dangal", "Drama", 8.3));
        movies.add(new Movie("Titanic", "Romance", 7.9));
        movies.add(new Movie("The Conjuring", "Horror", 7.5));

        return movies;
    }
}

