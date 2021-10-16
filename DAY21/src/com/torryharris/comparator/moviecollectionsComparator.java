package com.torryharris.comparator;

import com.torryharris.model.movie;

import java.util.Comparator;

public class moviecollectionsComparator implements Comparator<movie> {
    @Override
    public int compare(movie o1, movie o2) {
        return Float.compare(o2.getCollection(),o1.getCollection());
    }
}
