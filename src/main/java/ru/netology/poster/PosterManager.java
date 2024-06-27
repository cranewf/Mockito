package ru.netology.poster;

public class PosterManager {

    private Poster[] posters = new Poster[0];
    private int withdrawTheLatest;

    public PosterManager(int withdrawTheLatest) {
        this.withdrawTheLatest = withdrawTheLatest;
    }

    public PosterManager() {
        this.withdrawTheLatest = 5;
    }

    public void addMovie(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }

    public Poster[] findLast() {
        int resultLength;
        if (posters.length < withdrawTheLatest) {
            resultLength = posters.length;
        } else {
            resultLength = withdrawTheLatest;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = posters[resultLength - 1 - i];
        }
        return result;
    }

    public Poster[] getPosters() {
        return posters;
    }

}
