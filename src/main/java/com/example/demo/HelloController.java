package com.example.demo;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("person", new Person());
        return "f";
    }

    @PostMapping("/")
    public String process(@Valid Person person, BindingResult errors) {
        return "f";
    }

    public class Person {

        @NotEmpty(message = "{msgCode}")
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
