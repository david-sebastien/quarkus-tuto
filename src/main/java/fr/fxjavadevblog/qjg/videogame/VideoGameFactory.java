package fr.fxjavadevblog.qjg.videogame;

import java.lang.annotation.Annotation;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.spi.CDI;

public class VideoGameFactory
{
    /**
     * creates and brand new VideoGame instance with its own UUID as PK.
     *
     * @return instance of a VideoGame
     */
    public static VideoGame newInstance()
    {
        // ask CDI for the instance, injecting required dependencies.
        return CDI.current().select(VideoGame.class).get();
    }
}