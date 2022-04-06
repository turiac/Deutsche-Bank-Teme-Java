package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    @GetMapping("/view")
    public ModelAndView displayView() {
        List<String> carNames = new ArrayList<>();
        carNames.add("car1");
        carNames.add("car2");
        carNames.add("car3");
        ModelAndView modelAndView = new ModelAndView("view-pages");
        modelAndView.addObject("cars", carNames);
        return modelAndView;
    }
}
