package com.torryharris.comparator;

import com.torryharris.model.movie;

import java.util.Comparator;

public class movieyearComparator implements Comparator<movie> {
    @Override
    public int compare(movie o1, movie o2) {
        return o1.getYear()-o2.getYear();

    }
}
