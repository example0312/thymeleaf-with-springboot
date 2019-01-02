package org.ssu.ac.kr.sslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/index")
    public String getIndexPage(Model model, @RequestParam(value="name", defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "index";
    }
}
