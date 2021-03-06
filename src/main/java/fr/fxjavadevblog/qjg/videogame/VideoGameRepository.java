package fr.fxjavadevblog.qjg.videogame;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.fxjavadevblog.qjg.genre.Genre;

/**
 * CRUD repository for the VideoGame class. Primary key is a UUID represented by a String.
 * This repository is created by Hibernate Data JPA.
 * 
 * @author François-Xavier Robin
 *
 */

public interface VideoGameRepository extends CrudRepository<VideoGame, String>
{
    /**
     * gets every Video Game filtered by the given Genre.
     * 
     * @param genre
     *    genre of video game
     *    @see Genre
     *    
     * @return
     *    a list of video games
     */
    List<VideoGame> findByGenre(Genre genre);
}