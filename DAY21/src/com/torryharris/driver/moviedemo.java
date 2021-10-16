package com.torryharris.driver;

import com.torryharris.comparator.movieIMDBComparator;
import com.torryharris.comparator.moviecollectionsComparator;
import com.torryharris.comparator.movieyearComparator;
import com.torryharris.model.movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class moviedemo {
    public static void main(String[] args) {
        movie m1 = new movie("tenet",2020,4.0f,4.0f);
        movie m2 = new movie("ava",2018,4.5f,3.3f);
        movie m3 = new movie("MH",2016,5.0f,6.5f);
        movie m4 = new movie("fm",2021,3.4f,5.6f);
        movie m5 = new movie("parasite",2015,3.6f,1.5f);

        ArrayList<movie> mArrayList= new ArrayList<>();
        mArrayList.add(m1);
        mArrayList.add(m2);
        mArrayList.add(m3);
        mArrayList.add(m4);
        mArrayList.add(m5);
         int i;
         Scanner sc = new Scanner(System.in);
        System.out.println("sorting option:\n 1. title \n 2.year \n 3.imdbrating \n 4. collections \n enter option:");
         i=sc.nextInt();

         if (i == 1){
             System.out.println("sorting by title");
             mArrayList.sort(null);
             Iterator<movie> movieIterator=mArrayList.iterator();
             while (movieIterator.hasNext())
                 System.out.println(movieIterator.next());
             System.out.println();

         }
         else if(i == 2){
             System.out.println("sorting by year");
             mArrayList.sort(new movieyearComparator());
             Iterator<movie> movieIterator=mArrayList.iterator();
             while (movieIterator.hasNext())
                 System.out.println(movieIterator.next());
         }
         else if(i == 3) {
             System.out.println("sorting by IMDB");
             mArrayList.sort(new movieIMDBComparator());
             Iterator<movie> movieIterator = mArrayList.iterator();
             while (movieIterator.hasNext())
                 System.out.println(movieIterator.next());
             System.out.println();
         }
         else if(i == 4){
             System.out.println("sorting by collections");
             mArrayList.sort(new moviecollectionsComparator() );
             Iterator<movie> movieIterator=mArrayList.iterator();
             while (movieIterator.hasNext())
                 System.out.println(movieIterator.next());
             System.out.println();

         }
         else
             System.out.println("invalid input!!");

    }


    }


