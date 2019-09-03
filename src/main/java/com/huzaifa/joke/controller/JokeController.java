package com.huzaifa.joke.controller;

import com.huzaifa.joke.service.JokeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeInterface jokeInterface;

    @Autowired
    public JokeController(JokeInterface jokeInterface) {
        this.jokeInterface = jokeInterface;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeInterface.joke());
        return "chuck norris";
    }
}
