package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterManagerTest {
    Poster poster1 = new Poster(1, "Бладшот", "12.03.2020");
    Poster poster2 = new Poster(2, "Вперёд", "05.03.2020");
    Poster poster3 = new Poster(3, "Отель Белград", "03.03.2020");
    Poster poster4 = new Poster(4, "Джентльмены", "13.02.2020");
    Poster poster5 = new Poster(5, "Человек-невидимка", "05.03.2020");
    Poster poster6 = new Poster(6, "Тролли. Мировой тур", "19.03.2020");
    Poster poster7 = new Poster(7, "Номер один", "19.03.2020");

    @Test
    public void addMovie() {
        PosterManager poster = new PosterManager();
        poster.addMovie(poster1);
        poster.addMovie(poster2);
        poster.addMovie(poster3);
        poster.addMovie(poster4);
        poster.addMovie(poster5);
        poster.addMovie(poster6);
        poster.addMovie(poster7);

        Poster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7};
        Poster[] actual = poster.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNullMovie() {
        PosterManager poster = new PosterManager();

        Poster[] expected = {};
        Poster[] actual = poster.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovieTwo() {
        PosterManager poster = new PosterManager();

        Poster[] expected = {};
        Poster[] actual = poster.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        PosterManager poster = new PosterManager();
        poster.addMovie(poster1);
        poster.addMovie(poster2);
        poster.addMovie(poster3);

        Poster[] expected = {poster1, poster2, poster3};
        Poster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast(){
        PosterManager last = new PosterManager();

        last.addMovie(poster3);
        last.addMovie(poster4);
        last.addMovie(poster5);
        last.addMovie(poster6);
        last.addMovie(poster7);

        Poster[] expected = {poster7, poster6, poster5, poster4, poster3};
        Poster[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastSecound(){
        PosterManager last = new PosterManager(7);
        last.addMovie(poster1);
        last.addMovie(poster2);
        last.addMovie(poster3);
        last.addMovie(poster4);
        last.addMovie(poster5);
        last.addMovie(poster6);
        last.addMovie(poster7);

        Poster[] expected = {poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Poster[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastThree(){
        PosterManager last = new PosterManager(8);

        last.addMovie(poster1);
        last.addMovie(poster2);
        last.addMovie(poster3);
        last.addMovie(poster4);
        last.addMovie(poster5);
        last.addMovie(poster6);
        last.addMovie(poster7);

        Poster[] expected = {poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Poster[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}