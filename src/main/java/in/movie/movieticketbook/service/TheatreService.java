package in.movie.movieticketbook.service;

import in.movie.movieticketbook.entity.Movie;
import in.movie.movieticketbook.entity.Theatre;
import in.movie.movieticketbook.exception.ResourceNotFoundException;

import java.util.List;

public interface TheatreService {
    public Theatre addTheatre(Theatre theatre);
    public List<Theatre> theatreList();
    public  Theatre theatreById(int theatreId) throws ResourceNotFoundException;
    public String deleteTheatre(Integer theatreId);
    Theatre updateTheatre (Theatre theatre,int theatreId);

}
