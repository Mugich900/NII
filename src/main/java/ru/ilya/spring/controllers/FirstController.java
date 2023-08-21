package ru.ilya.spring.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {
    HttpSession session;
    @GetMapping("/hello")
    public String init(HttpServletRequest request){
        session = request.getSession();

        System.out.println(session.getId());
        return "first/hello";
    }
    @PostMapping("/hello")
    public void setParam(){
        session.setAttribute("key", 1);
    }

    @GetMapping("/bye")
    public String getParam(){
        System.out.println(session.getAttribute("key"));
        return "first/bye";
    }
}
