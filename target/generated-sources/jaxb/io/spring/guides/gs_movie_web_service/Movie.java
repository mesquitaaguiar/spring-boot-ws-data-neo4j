//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v4.0.6 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//


package io.spring.guides.gs_movie_web_service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de movie complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="movie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tagline" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="released" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="votes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {
    "title",
    "tagline",
    "released",
    "votes"
})
public class Movie {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String tagline;
    protected int released;
    protected int votes;

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade tagline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagline() {
        return tagline;
    }

    /**
     * Define o valor da propriedade tagline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagline(String value) {
        this.tagline = value;
    }

    /**
     * Obtém o valor da propriedade released.
     * 
     */
    public int getReleased() {
        return released;
    }

    /**
     * Define o valor da propriedade released.
     * 
     */
    public void setReleased(int value) {
        this.released = value;
    }

    /**
     * Obtém o valor da propriedade votes.
     * 
     */
    public int getVotes() {
        return votes;
    }

    /**
     * Define o valor da propriedade votes.
     * 
     */
    public void setVotes(int value) {
        this.votes = value;
    }

}
