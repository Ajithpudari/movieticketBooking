package in.movie.movieticketbook.controller;


import in.movie.movieticketbook.entity.Movie;
import in.movie.movieticketbook.exception.ResourceNotFoundException;
import in.movie.movieticketbook.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/v2")
public class MovieController {

    @Autowired
   private  MovieService movieService;

    //add movie rest api

    @PostMapping("/add")
        public ResponseEntity<Movie> addmovie(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.addMovie(movie), HttpStatus.CREATED);
       // movieService.addMovie(movie);
      //  return movie.getMovieName();
    }
    //Get all movies
    @GetMapping("/getAll")
    public List<Movie> list() {
       return movieService.moviesList();
    }
    //Get movie by id
    @GetMapping("/{getById}")
    public ResponseEntity<Movie> movieByID(@PathVariable("getById") int movieId) throws ResourceNotFoundException {
        return new ResponseEntity<Movie>(movieService.movieById(movieId),HttpStatus.OK);
    }



    
    //update movie
   //<!--- @PutMapping("/update1")
   // public ResponseEntity<Movie> updatemovie(@RequestBody Movie movie){
       // for (int i=0; i< list().size();i++){
         //   Movie m= list().get(i);
         //   if (m.movieid().equals(id)){
         //       movieService.set(id,movie);
         //       return;
        //    }
      //  }//

       // movieService.updateMovie(movie);
      //  return movie.getMovieName();
     //return new ResponseEntity<Movie>(movieService.updateMovie(movie,movieId),HttpStatus.OK);
      //  return movie.getMovieName();
   // }
    @DeleteMapping("/delete/{movieId}")
    public List<Movie> delete(@PathVariable("movieId") Integer movieId){
         movieService.deleteMovie(movieId);
        return movieService.moviesList();
    }

}
