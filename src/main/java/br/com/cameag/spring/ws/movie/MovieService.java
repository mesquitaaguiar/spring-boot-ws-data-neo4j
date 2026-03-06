package br.com.cameag.spring.ws.movie;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private final MovieRepository movieRepository;

	MovieService(MovieRepository movieRepository) {

		this.movieRepository = movieRepository;
	}

	public List<MovieResultDto> searchListMoviesByTitle(String title) {
		return this.movieRepository.findSearchResults(title)
				.stream()
				.map(MovieResultDto::new)
				.toList();
	}
	
	public Movie searchMoviesByTitle(String title) {
		return this.movieRepository.findSearchResults(title)
					.stream()
						.findFirst()
							.get();
	}
}
