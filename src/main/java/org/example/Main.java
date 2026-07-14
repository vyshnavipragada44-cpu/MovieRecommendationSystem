package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Movie Recommendation System =====");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite genre (Action, Comedy, Drama, Horror, Romance, Sci-Fi): ");
        String genre = scanner.nextLine();

        User user = new User(name, genre);

        RecommendationEngine.recommendMovies(user);

        scanner.close();
    }
}