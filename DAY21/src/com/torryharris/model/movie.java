package com.torryharris.model;

public class movie implements Comparable<movie> {
    private String title;
    private int year;
    private float imdbrating;
    private float collection;



    public movie(String title, int year, float imdbrating, float collection) {
        this.title = title;
        this.year = year;
        this.imdbrating = imdbrating;
        this.collection = collection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(float imdbrating) {
        this.imdbrating = imdbrating;
    }

    public float getCollection() {
        return collection;
    }

    public void setCollection(float collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdbrating=" + imdbrating +
                ", collection=" + collection +
                '}';
    }

    @Override
    public int compareTo(movie o) {
        return this.title.compareTo(o.title);
    }


}
