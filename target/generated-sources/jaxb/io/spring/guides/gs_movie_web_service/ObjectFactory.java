//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v4.0.6 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//


package io.spring.guides.gs_movie_web_service;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_movie_web_service package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_movie_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieRequest }
     * 
     * @return
     *     the new instance of {@link GetMovieRequest }
     */
    public GetMovieRequest createGetMovieRequest() {
        return new GetMovieRequest();
    }

    /**
     * Create an instance of {@link GetMovieResponse }
     * 
     * @return
     *     the new instance of {@link GetMovieResponse }
     */
    public GetMovieResponse createGetMovieResponse() {
        return new GetMovieResponse();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     * @return
     *     the new instance of {@link Movie }
     */
    public Movie createMovie() {
        return new Movie();
    }

}
