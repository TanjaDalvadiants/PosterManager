package ru.netology.javaqa.javaqamvn.repository;

import domain.MovieItems;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public class MovieManager {
    private MovieRepository repo;
    public MovieManager(MovieRepository repo) {
        this.repo = repo;
    }
    public  void add (MovieItems item){
        repo.save(item);
    }
    public MovieItems[] getItems(){
        MovieItems[] all = repo.getItems();
        MovieItems[] reversed = new MovieItems[all.length];
        for (int i = 0; i < reversed.length; i ++ ){
            reversed[i] = all[all.length - 1 -i];
        }
        return reversed;
    }





}





