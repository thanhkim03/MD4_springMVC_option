package com.codegym.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/index")
    public ModelAndView home1(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("n") String[] condiment) {
        ModelAndView modelAndView=new ModelAndView("option");
        modelAndView.addObject("condiment",condiment);
        return modelAndView;
    }
}
