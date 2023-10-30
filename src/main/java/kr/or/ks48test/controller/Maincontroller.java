package kr.or.ks48test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Maincontroller {

    @GetMapping("/")
    public String mainPange(Model model){
        model.addAttribute("title","메인페이지");
        return"main";
    }
}
