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





    @Test
    public void ShouldReverseAllItems() {
        MovieItems[] items = {item1, item2, item3};
        doReturn(items).when(repo).getItems();

        MovieItems[] expected = {item3, item2, item1};
        MovieItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }


}
