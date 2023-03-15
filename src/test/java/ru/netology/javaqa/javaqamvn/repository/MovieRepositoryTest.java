package ru.netology.javaqa.javaqamvn.repository;

import domain.MovieItems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


public class MovieRepositoryTest {



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
    public void ShouldFindAllIfMoreThanLimit() {
        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.save(item11);
        MovieItems[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        MovieItems[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfLessThanLimit() {

        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        MovieItems[] expected = {item1, item2, item3};
        MovieItems[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void ShouldFindAllIfLimitEquals() {

        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);

        MovieItems[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        MovieItems[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfNull() {
        MovieRepository repo = new MovieRepository();


        MovieItems[] expected = {};
        MovieItems[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }



//

    @Test
    public void ShouldRemoveById() {
        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2);

        MovieItems[] expected = {item1, item3};
        MovieItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldRemoveByIdIfLimitEquals() {
        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.removeById(item2);

        MovieItems[] expected = {item1, item3, item4, item5, item6, item7, item8, item9, item10};
        MovieItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindByIdIfNull() {
        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.findById(item6);

        MovieItems[] expected = {null};
        MovieItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindById() {
        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.findById(item5);

        MovieItems[] expected = {item5};
        MovieItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindByIdIfLimitEquals() {
        MovieRepository repo = new MovieRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.findById(item5);

        MovieItems[] expected = {item5};
        MovieItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }



}

