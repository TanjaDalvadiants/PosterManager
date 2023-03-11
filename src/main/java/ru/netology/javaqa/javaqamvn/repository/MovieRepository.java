package ru.netology.javaqa.javaqamvn.repository;

import domain.MovieItems;

public class MovieRepository {
    private MovieItems[] items = new MovieItems[0];

    public void save(MovieItems item) {


        MovieItems[] tmp = new MovieItems[items.length + 1];


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

        MovieItems[] result = new MovieItems[items.length];
        for (int i = 0; i < result.length; i = i + 1) {
            result[i] = items[items.length - 1 - i];
        }
        return result;

    }

    public void removeById(MovieItems id) {

        MovieItems[] tmp = new MovieItems[items.length - 1];
        int copyToIndex = 0;
        for (MovieItems item : items) {
            if (item.getId() != id.getId()) {
                tmp[copyToIndex] = item;
                copyToIndex++;

            }
        }
        items = tmp;
    }

    public MovieItems[] getItems() {
        return items;
    }

    public void findById(MovieItems id) {
        MovieItems[] tmp = new MovieItems[items.length-(items.length-1)];
        int copyToIndex = 0;
        for (MovieItems item : items) {
            if (item.getId() == id.getId()) {
                tmp[copyToIndex] = item;
                copyToIndex++;

            }
        }
        items = tmp;
    }
}
