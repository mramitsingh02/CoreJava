package com.tester.java8.collection.lambda.case2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Bahubali", "Prabhas", "Anushka", DirectorFactroy.getDirectors(1));
        Movie movie2 = new Movie("RRR", "Prabhas", "Anushka", DirectorFactroy.getDirectors(2));
        Movie movie3 = new Movie("Haripoter", "Prabhas", "Anushka", DirectorFactroy.getDirectors(2));
        List<Movie> movies = Arrays.asList(movie1, movie2, movie3);

        Map<String, Long> filebyDirector = movies.stream().flatMap(movie -> movie.getDirectors()
                .stream()).collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
        System.out.println(filebyDirector);

    }
}
