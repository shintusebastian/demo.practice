package com.demo.practice.demo.practice.controller;

import com.demo.practice.demo.practice.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormHandlingController {
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")Student student,
                             ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("className", student.getClassName());
        model.addAttribute("rollNo", student.getRollNo());

        return "welcome";
    }
}
