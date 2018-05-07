package br.com.incubadoras2it.springmvctutorial.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PEDRO on 07/05/2018.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("title", "Spring MVC Tutorial");
        model.addAttribute("description", "Um tutorial introdutório abordando Spring MVC e Thymeleaf");

        return "index";
    }
}
