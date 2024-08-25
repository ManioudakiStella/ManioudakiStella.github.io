package com.Manioudaki.Manioudaki_app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String home() {
        return "EnglishPages/mainMenu";
    }

    @GetMapping("/mainGR")
    public String greek() {
        return "GreekPages/mainMenuGR";
    }

    @GetMapping("/about")
    public String about() {
        return "EnglishPages/aboutMe";
    }

    @GetMapping("/aboutGR")
    public String aboutGR() {
        return "GreekPages/aboutMeGR";
    }

    @GetMapping("/news")
    public String news() {
        return "EnglishPages/news";
    }

    @GetMapping("/newsGR")
    public String newsGR() {
        return "GreekPages/newsGR";
    }

    @GetMapping("/projects")
    public String projects() {
        return "EnglishPages/projects";
    }

    @GetMapping("/projectsGR")
    public String projectsGR() {
        return "GreekPages/projectsGR";
    }

    @GetMapping("/exhibitions")
    public String exhibitions() {
        return "EnglishPages/exhibitions";
    }

    @GetMapping("/exhibitionsGR")
    public String exhibitionsGR() {
        return "GreekPages/exhibitionsGR";
    }

    @GetMapping("/project1")
    public String project1() {
        return "EnglishPages/project1.html";
    }
    @GetMapping("/project2")
    public String project2() {
        return "EnglishPages/project2.html";
    }
    @GetMapping("/project3")
    public String project3() {
        return "EnglishPages/project3.html";
    }
    @GetMapping("/project4")
    public String project4() {
        return "EnglishPages/project4.html";
    }
    @GetMapping("/project5")
    public String project5() {
        return "EnglishPages/project5.html";
    }
    @GetMapping("/project6")
    public String project6() {
        return "EnglishPages/project6.html";
    }
    @GetMapping("/project7")
    public String project7() {
        return "EnglishPages/project7.html";
    }
    @GetMapping("/project8")
    public String project8() {
        return "EnglishPages/project8.html";
    }
    @GetMapping("/project9")
    public String project9() {
        return "EnglishPages/project9.html";
    }
    @GetMapping("/project1GR")
    public String project1GR() {
        return "GreekPages/project1GR.html";
    }
    @GetMapping("/project2GR")
    public String project2GR() {
        return "GreekPages/project2GR.html";
    }
    @GetMapping("/project3GR")
    public String project3GR() {
        return "GreekPages/project3GR.html";
    }
    @GetMapping("/project4GR")
    public String project4GR() {
        return "GreekPages/project4GR.html";
    }
    @GetMapping("/project5GR")
    public String project5GR() {
        return "GreekPages/project5GR.html";
    }
    @GetMapping("/project6GR")
    public String project6GR() {
        return "GreekPages/project6GR.html";
    }
    @GetMapping("/project7GR")
    public String project7GR() {
        return "GreekPages/project7GR.html";
    }
    @GetMapping("/project8GR")
    public String project8GR() {
        return "GreekPages/project8GR.html";
    }
    @GetMapping("/project9GR")
    public String project9GR() {
        return "GreekPages/project9GR.html";
    }

}
