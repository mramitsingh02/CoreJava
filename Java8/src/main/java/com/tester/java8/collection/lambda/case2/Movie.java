package com.tester.java8.collection.lambda.case2;

import java.util.List;

public class Movie {
    private String name;
    private String hero;
    private String heroine;
    private List<Director> directors;

    public Movie(String name, String hero, String heroine, List<Director> directors) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
        this.directors = directors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroine() {
        return heroine;
    }

    public void setHeroine(String heroine) {
        this.heroine = heroine;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", hero='" + hero + '\'' +
                ", heroine='" + heroine + '\'' +
                ", directors=" + directors +
                '}';
    }
}
