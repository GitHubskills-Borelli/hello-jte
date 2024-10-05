package dev.danvega.jte;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        var page = new Page("Hello, World", "This is my first home page!");
        var items = new java.util.ArrayList<>(List.of("Item 1", "Item 2", "Item 3"));
        var cni = 1234567890;
        items.clear();

        model.addAttribute("name","Dan");
        model.addAttribute("cni", cni);
        model.addAttribute("items",items);
        model.addAttribute("page",page);

        return "index";
    }

}
