package com.example.demo._03PredefinedFunctionalInterfaces._03Consumer;

/**
 * Problem :
 * Write a program to display movie information using 'Consumer'
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Mahesh
 */
public class _02ConsumerExample {
	public static void main(String[] args) {
		List<Movie> movies = Movie.getMovies();

		Consumer<List<Movie>> printMovies = (moviesList) -> {
			for (Movie m : moviesList) {
				System.out.println("Movie : " + m.name);
				System.out.println("Actor : " + m.actor);
				System.out.println("Actress : " + m.actress);
				System.out.println("------------------------");
			}
		};

		printMovies.accept(movies);
	}
}

class Movie {
	String name;
	String actor;
	String actress;

	public Movie(String name, String actor, String actress) {
		this.name = name;
		this.actor = actor;
		this.actress = actress;
	}

	public static List<Movie> getMovies() {
		return Arrays.asList(
				new Movie("Don", "Shahrukh", "Priyanka"),
				new Movie("3 Idiots", "Amir", "Karina"),
				new Movie("Bahubali", "Prabhas", "Anushka")
		);
	}
}