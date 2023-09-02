package be.week2project1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String nimi, @RequestParam(name="age") int ika, Model model) {
        model.addAttribute("name", nimi);
        model.addAttribute("age", ika);

        return "hello";
    }
}