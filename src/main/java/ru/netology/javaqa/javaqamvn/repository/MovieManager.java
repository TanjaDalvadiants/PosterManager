package ru.netology.javaqa.javaqamvn.repository;

import domain.MovieItems;

public class MovieManager {
    private MovieItems[] items = new MovieItems[0];
    private int limit;

    public MovieManager() {
        this.limit = 10;

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }

    public void save(MovieItems item) {
        int resultLength;

        if (items.length < limit) {
            resultLength = items.length;

        } else {
            resultLength = limit;
        }

        MovieItems[] tmp = new MovieItems[resultLength + 1];


        for (int i = 0; i < items.length; i = i + 1) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    public MovieItems[] findAll() {
        return items;

    }

    public MovieItems[] findLast() {
        int resultLength;

        if (items.length < limit) {
            resultLength = items.length;

        } else {
            resultLength = limit;
        }


        MovieItems[] result = new MovieItems[resultLength];
        for (int i = 0; i < result.length; i = i + 1) {
            result[i] = items[items.length - 1 - i];
        }
        return result;

    }
    public void removeById(int id) {
        int resultLength;

        if (items.length < limit) {
            resultLength = items.length;

        } else {
            resultLength = limit;
        }
        int length = items.length - 1;
        MovieItems[] tmp = new MovieItems[resultLength + 1];
        int index = 0;
        for (MovieItemitems : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        // меняем наши элементы
        items = tmp;
    }


}

