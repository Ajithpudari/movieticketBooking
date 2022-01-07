package in.movie.movieticketbook.service;

import in.movie.movieticketbook.entity.Theatre;
import in.movie.movieticketbook.exception.ResourceNotFoundException;
import in.movie.movieticketbook.repository.ITheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheatreServiceImplimentaion implements TheatreService {
    @Autowired
    public ITheatreRepository theatreRepo;
    //add theatre
    @Override
    public Theatre addTheatre(Theatre theatre) {

        return theatreRepo.save(theatre);

    }
//list of theatre
    @Override
    public List<Theatre> theatreList() {
        return theatreRepo.findAll();
    }
    //list by id
    @Override
    public Theatre theatreById(int theatreId) throws ResourceNotFoundException {
        Optional<Theatre> theatre = theatreRepo.findById(theatreId);
        if (theatre.isPresent()) {
            return theatre.get();
        } else {
            throw new ResourceNotFoundException("Theatre", "theatreById", theatreId);
        }
    }
    //delete
    @Override
    public String deleteMovie(Integer theatreId) {
        theatreRepo.deleteById(theatreId);
        return "deleted";
    }
    //update
  //  public Theatre updateThatre(theatre)

}