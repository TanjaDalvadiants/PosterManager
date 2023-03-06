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
    public void ShouldFindAll(){
        MovieManager manager = new MovieManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);

        MovieItems[] expected = {item1, item2, item3,item4, item5, item6,item7, item8, item9,item10};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindAllIfNull(){
        MovieManager manager = new MovieManager();


        MovieItems[] expected = {};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindAllIfAboveMax(){
        MovieManager manager = new MovieManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);


        MovieItems[] expected = {item1, item2, item3,item4, item5, item6,item7, item8, item9,item10};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindLast(){
        MovieManager manager = new MovieManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);

        MovieItems[] expected = {item3, item2, item1};
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllSecondConstructor(){
        MovieManager manager = new MovieManager(5);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);

        MovieItems[] expected = {item1, item2, item3};
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindLastIfBelowLimitSecondConstructor(){
        MovieManager manager = new MovieManager(3);
        manager.add(item1);
        manager.add(item2);


        MovieItems[] expected = {item2, item1};
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
