package hello.itemservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/kimdonghwan")
    public String getHome() {
        return "articleList";
    }

    @GetMapping("/kdh")
    public String getHome2() {
        return "articleList2";
    }

    @PostMapping("/post")
    public String getHome3() {
        return "articleList2";
    }
}