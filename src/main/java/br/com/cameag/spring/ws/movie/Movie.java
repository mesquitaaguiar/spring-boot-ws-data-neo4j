package br.com.cameag.spring.ws.movie;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Movie {

	@Id
	private final String title;

	private final String tagline;

	private Integer released;

	private Long votes;

	public Movie(String title, String tagline) {
		this.title = title;
		this.tagline = tagline;
	}

	public String getTitle() {
		return title;
	}

	public String getTagline() {
		return tagline;
	}

	public Integer getReleased() {
		return released;
	}

	public Long getVotes() {
		return votes;
	}

	public void setReleased(Integer released) {
		this.released = released;
	}

	public void setVotes(Long votes) {
		this.votes = votes;
	}
	
	public io.spring.guides.gs_movie_web_service.Movie copyTo(){
		io.spring.guides.gs_movie_web_service.Movie movie = new io.spring.guides.gs_movie_web_service.Movie();
		movie.setTitle(this.getTitle());
		movie.setTagline(this.getTagline());
		movie.setReleased(this.getReleased());
		movie.setVotes(this.getVotes().intValue());
		return movie;
	}
}
