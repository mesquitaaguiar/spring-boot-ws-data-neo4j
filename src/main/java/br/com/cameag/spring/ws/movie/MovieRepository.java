package br.com.cameag.spring.ws.movie;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface MovieRepository extends Repository<Movie, String> {

	@Query("MATCH (movie:Movie) WHERE movie.title CONTAINS $title RETURN movie")
	List<Movie> findSearchResults(@Param("title") String title);
}
