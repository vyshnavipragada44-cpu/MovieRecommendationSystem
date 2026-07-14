package org.example;

import java.util.ArrayList;

public class RecommendationEngine {

    public static void recommendMovies(User user) {

        ArrayList<Movie> movies = MovieDatabase.getMovies();

        System.out.println("\nRecommended Movies for " + user.getName() + ":");
        System.out.println("---------------------------------------");

        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(user.getPreferredGenre())) {
                System.out.println(movie);
            }
        }
    }
}
