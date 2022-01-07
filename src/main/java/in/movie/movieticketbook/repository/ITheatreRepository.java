package in.movie.movieticketbook.repository;

import in.movie.movieticketbook.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITheatreRepository extends JpaRepository<Theatre,Integer> {
}
