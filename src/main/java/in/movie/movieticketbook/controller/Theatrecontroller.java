package in.movie.movieticketbook.controller;

import in.movie.movieticketbook.entity.Movie;
import in.movie.movieticketbook.entity.Theatre;
import in.movie.movieticketbook.exception.ResourceNotFoundException;
import in.movie.movieticketbook.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("app/v3")
public class Theatrecontroller {
    @Autowired
    private TheatreService theatreService;


    //add theatre
    @PostMapping("/add")
    public ResponseEntity<Theatre> addTheatre(@RequestBody Theatre theatre) {
        return new ResponseEntity<Theatre>(theatreService.addTheatre(theatre), HttpStatus.CREATED);

    }
    //get all theatre
    @GetMapping("/getAll1")
    public List<Theatre> list() {
        return theatreService.theatreList();
    }

    //getByid

    @GetMapping("/{getById}")
    public ResponseEntity<Theatre> TheatreById(@PathVariable("getById") int theatreId) throws ResourceNotFoundException {
        return new ResponseEntity<Theatre>(theatreService.theatreById(theatreId),HttpStatus.OK);
    }

    //delete theatre
    @DeleteMapping("/delete/{theatreId}")
    public List<Theatre> deleteTheatre(@PathVariable("theatreId") Integer theatreId){
        theatreService.deleteTheatre(theatreId);
        return theatreService.theatreList();
    }

    // @PutMapping("/update1")
  //  public ResponseEntity<Movie> updatetheatre(@RequestBody Theatre theatre) {

    //update theatre
   // theatreService.updatethatre(thatre);
    //  return thatre.getThatreName();
    //return new ResponseEntity<Thatre>(TheatreService.updateThatre("thatre","thatreId","thatreid"),HttpStatus.OK);
    //  return movie.getTheatreName();



}
