package com.hiwotab.springboot13.controller;

import com.hiwotab.springboot13.model.Actor;
import com.hiwotab.springboot13.model.Movie;
import com.hiwotab.springboot13.repositories.ActorRepository;
import com.hiwotab.springboot13.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping("/")
    public @ResponseBody String showIndex()
    {
        Actor a = new Actor();
        a.setName("Sandra Bullock");
        a.setRealname("Sandra Mae Bullowski");
        actorRepository.save(a);

        Movie movie = new Movie();
        movie.setTitle("Emoji Movie");
        movie.setYear(2017);
        movie.setDescription("About Emojis...");

        movie.addActor(a);

        movieRepository.save(movie);

        return "index";
    }


}


