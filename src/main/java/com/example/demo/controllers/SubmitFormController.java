package com.example.demo.controllers;

import com.example.demo.model.Form;
import com.example.demo.service.formService.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubmitFormController {
    @Autowired
    IFormService iFormService;

    @GetMapping("/create")
    public ModelAndView getCreate() {
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("form",new Form());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView postCreate(@ModelAttribute Form form) {
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("form",new Form());
        iFormService.save(form);
        return modelAndView;
    }
}
