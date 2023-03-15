package ru.netology.javaqa.javaqamvn.repository;

import domain.MovieItems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class MovieManagerTest {
    MovieRepository repo = Mockito.mock(MovieRepository.class);
    MovieManager manager = new MovieManager(repo);

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
    MovieItems item11 = new MovieItems(11, "drama", 2010);


    @Test
    public void ShouldReverseAllItems() {
        MovieItems[] items = {item1, item2, item3};
        doReturn(items).when(repo).getItems();

        MovieItems[] expected = {item3, item2, item1};
        MovieItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLast() {
        MovieItems[] items = {item1, item2, item3};
        doReturn(items).when(repo).getItems();

        MovieItems[] expected = {item3, item2, item1};
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
//    @Test
//    public void ShouldFindLastIfAboveLimit() {
//        MovieItems[] items = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
//        doReturn(items).when(repo).getItems();
//        MovieItems[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
//        MovieItems[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//    public void ShouldFindLastIfAboveLimit() {
//        MovieRepository repo = new MovieRepository();
//        repo.save(item1);
//        repo.save(item2);
//        repo.save(item3);
//        repo.save(item4);
//        repo.save(item5);
//        repo.save(item6);
//        repo.save(item7);
//        repo.save(item8);
//        repo.save(item9);
//        repo.save(item10);
//        repo.save(item11);
//        MovieItems[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
//        MovieItems[] actual = repo.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void ShouldFindAllIfLessThanLimitSecondConstructor() {
//        MovieManager manager = new MovieManager(5);
//        manager.save(item1);
//        manager.save(item2);
//        manager.save(item3);
//
//        MovieItems[] expected = {item1, item2, item3};
//        MovieItems[] actual = manager.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldFindAllIfMoreThanLimitSecondConstructor() {
//        MovieManager manager = new MovieManager(2);
//        manager.save(item1);
//        manager.save(item2);
//        manager.save(item3);
//
//        MovieItems[] expected = {item1, item2, item3};
//        MovieItems[] actual = manager.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldFindLastIfBelowLimitSecondConstructor() {
//        MovieManager manager = new MovieManager(3);
//        manager.save(item1);
//        manager.save(item2);
//
//
//        MovieItems[] expected = {item2, item1};
//        MovieItems[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldFindLastIfAboveLimitSecondConstructor() {
//        MovieRepository repo = new MovieRepository(1);
//        repo.save(item1);
//        repo.save(item2);
//
//
//        MovieItems[] expected = {item2};
//        MovieItems[] actual = repo.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }


}
