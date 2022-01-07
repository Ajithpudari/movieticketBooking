package in.movie.movieticketbook.service;

import in.movie.movieticketbook.entity.Movie;
import in.movie.movieticketbook.entity.Theatre;
import in.movie.movieticketbook.exception.ResourceNotFoundException;

import java.util.List;

public interface MovieService {

    public Movie  movie();
    public Movie  addMovie(Movie movie);
    public Theatre  addMovie(Theatre theatre);
    public List<Movie> moviesList();
    public  Movie movieById(int movieId) throws ResourceNotFoundException;
    public String deleteMovie(Integer movieId);
    Movie updateMovie (Movie movie,int movieId);

}
