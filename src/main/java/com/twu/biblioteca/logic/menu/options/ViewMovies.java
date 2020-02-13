package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.Movie;

import java.util.List;

public class ViewMovies implements MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        String movieFormat = biblotecaApp.getFormat();

        StringBuilder movieList = new StringBuilder("\t\t\t"+Message.MOVIE_LIST+"\n");
        List<Movie> movies = library.movies();

        if (movies.size() == 0) {
            biblotecaApp.displayMessage(Message.EMPTY_LIBRARY);
        }

        for (Movie movie : movies) {
            movieList.append(movie.display(movieFormat)).append("\n");
        }

        biblotecaApp.displayMovieList(movieList.toString());
    }

    @Override
    public String description() {
        return "View Movies";
    }
}
