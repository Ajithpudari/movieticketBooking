package in.movie.movieticketbook.service;

import in.movie.movieticketbook.entity.Movie;
import in.movie.movieticketbook.entity.Theatre;
import in.movie.movieticketbook.exception.ResourceNotFoundException;

import in.movie.movieticketbook.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieServiceImplimentation implements MovieService {


    @Autowired
    public MovieRepo movierepo;


    @Override
    public Movie addMovie(Movie movie) {
     return movierepo.save(movie);
    }

    @Override
    public Theatre addMovie(Theatre theatre) {
        return null;
    }


    @Override
    public String deleteMovie(Integer movieId) {
        movierepo.deleteById(movieId);
        return "Deleted";

    }

    //@Override
   // public Movie updateMovie(Movie movie) {

   //     movierepo.save(movie);
     //   return movie;

   // }

    @Override
    public Movie movie() {
        return movie();
    }


    @Override
    public List<Movie> moviesList() {
        return movierepo.findAll();
    }

    @Override
    public Movie movieById(int movieId) throws ResourceNotFoundException {
       Optional<Movie> movie= movierepo.findById(movieId);
       if (movie.isPresent()){
          return movie.get();
       }else{
      throw new ResourceNotFoundException("Movie", "movieByID",movieId);
          // return movie.get();
           }
    }
   // @Override
//    public List<Movie> moviebyid(Integer movieID) {

   //     Optional<Movie> movies=movierepo.findById(movieID);
   //     return movies;
   // }


    @Override
    public Movie updateMovie(Movie movie,int movieId) {
        //check movie is exist or not
       // Optional<Movie> existMovie = movierepo.findById(movieId);
      //  {
            Optional<Movie> movieOptional = movierepo.findById(movieId);
            if(movieOptional.isPresent()) {
                return movieOptional.get();
            } else {
                //throw new ResourceNotFoundException("Movie", "Id", existMovie);
                return movieOptional.get();

            }
        }
    }



