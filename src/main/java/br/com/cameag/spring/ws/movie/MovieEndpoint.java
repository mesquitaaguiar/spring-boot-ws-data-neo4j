package br.com.cameag.spring.ws.movie;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_movie_web_service.GetMovieRequest;
import io.spring.guides.gs_movie_web_service.GetMovieResponse;

@Endpoint
public class MovieEndpoint {
	
	// curl --header "Content-Type: text/xml" -d @request1.xml http://localhost:8080/service-movie-info
	private static final String NAMESPACE_URI = "https://spring.io/guides/gs-movie-web-service";

	private final MovieService movieService;

	public MovieEndpoint(MovieService movieService) {
		this.movieService = movieService;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMovieRequest")
	@ResponsePayload
	public GetMovieResponse getCountry(@RequestPayload GetMovieRequest request) {
		GetMovieResponse response = new GetMovieResponse();
		response.setMovie(movieService.searchMoviesByTitle(request.getName()).copyTo());
		return response;
	}
}
