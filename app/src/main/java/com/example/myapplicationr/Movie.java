package com.example.myapplicationr;

public class Movie
{
    public String title, rating, year;


    public Movie(String title, String rating, String year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
