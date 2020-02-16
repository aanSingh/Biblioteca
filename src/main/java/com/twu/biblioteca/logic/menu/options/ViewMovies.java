package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.Movie;
import com.twu.biblioteca.logic.menu.MenuItem;

import java.util.List;

public class ViewMovies implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String movieFormat = bibloteca.getFormat();

        StringBuilder movieList = new StringBuilder("\t\t\t" + Message.MOVIE_LIST + "\n");
        List<Movie> movies = library.movies();

        if (movies.size() == 0) {
            bibloteca.displayMessage(Message.EMPTY_LIBRARY);
        }

        for (Movie movie : movies) {
            movieList.append(movie.display(movieFormat)).append("\n");
        }

        bibloteca.displayMovieList(movieList.toString());
    }

    @Override
    public String description() {
        return "View Movies";
    }
}
