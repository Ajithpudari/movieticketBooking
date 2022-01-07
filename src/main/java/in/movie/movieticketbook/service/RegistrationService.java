package in.movie.movieticketbook.service;

import in.movie.movieticketbook.entity.Movie;
import in.movie.movieticketbook.entity.Registration;

import java.util.List;

public interface RegistrationService {
    public Movie  add(Registration registration);
    public List<Movie> list();
    public  Movie ById(int id);
    public String delete(int id);
    Registration update (Registration registration);
}
