package com.company;

public class FilmControl {
    Film[] filme;
    int nrDeLikes;


    static void likeFilm(Film[] filme, int nrDeLikes) {
        for (int i = 0; i <= nrDeLikes; i++) {
            int min = 0;
            int max = 6;
            int range = (max - min) + 1;
            range = (int) (Math.random() * range) + min;
            filme[range].aprecieri();
        }
    }

    static void print(Film[] filme) {
        for (int i = 0; i < filme.length; i++) {
            filme[i].printMovie();
        }
    }
}
