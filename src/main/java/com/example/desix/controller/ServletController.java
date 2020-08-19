package com.example.desix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ServletController {

    @GetMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("message", "ok you can do it");
        return "index";
    }

    @GetMapping("/cookie")
    public String getCookie(HttpServletResponse response){
        response.addCookie(new Cookie("dima","dima"));
        return "cookie";
    }
}
