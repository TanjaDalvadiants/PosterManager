package ru.netology.javaqa.javaqamvn.repository;

import domain.MovieItems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {


    MovieItems item1 = new MovieItems(1, "drama", 2001);
    MovieItems item2 = new MovieItems(2, "drama", 2002);
    MovieItems item3 = new MovieItems(3, "drama", 2003);
    MovieItems item4 = new MovieItems(4, "drama", 2004);
    MovieItems item5 = new MovieItems(5, "drama", 2005);
    MovieItems item6 = new MovieItems(6, "drama", 2006);
    MovieItems item7 = new MovieItems(7, "drama", 2007);
    MovieItems item8 = new MovieItems(8, "drama", 2008);
    MovieItems item9 = new MovieItems(9, "drama", 2009);
    MovieItems item10 = new MovieItems(10, "drama", 2010);
    MovieItems item11 = new MovieItems(10, "drama", 2010);

    @Test
    public void ShouldFindAllIfMoreThanLimit() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);
        MovieItems[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfLessThanLimit() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);

        MovieItems[] expected = {item1, item2, item3};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void ShouldFindAllIfLimitEquals() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);

        MovieItems[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfNull() {
        MovieManager manager = new MovieManager();


        MovieItems[] expected = {};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);

        MovieItems[] expected = {item3, item2, item1};
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastIfAboveLimit() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);
        MovieItems[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfLessThanLimitSecondConstructor() {
        MovieManager manager = new MovieManager(5);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);

        MovieItems[] expected = {item1, item2, item3};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfMoreThanLimitSecondConstructor() {
        MovieManager manager = new MovieManager(2);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);

        MovieItems[] expected = {item1, item2, item3};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastIfBelowLimitSecondConstructor() {
        MovieManager manager = new MovieManager(3);
        manager.save(item1);
        manager.save(item2);


        MovieItems[] expected = {item2, item1};
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastIfAboveLimitSecondConstructor() {
        MovieManager manager = new MovieManager(1);
        manager.save(item1);
        manager.save(item2);


        MovieItems[] expected = {item2};
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldRemoveById() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.removeById(item2);

        MovieItems[] expected = {item1, item3};
        MovieItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldRemoveByIdIfLimitEquals() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.removeById(item2);

        MovieItems[] expected = {item1, item3, item4, item5, item6, item7, item8, item9, item10};
        MovieItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindByIdIfNull() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.findById(item6);

        MovieItems[] expected = {null};
        MovieItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindById() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.findById(item5);

        MovieItems[] expected = {item5};
        MovieItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindByIdIfLimitEquals() {
        MovieManager manager = new MovieManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.findById(item5);

        MovieItems[] expected = {item5};
        MovieItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }



}
