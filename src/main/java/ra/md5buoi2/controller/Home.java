package ra.md5buoi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Home {

    @GetMapping
    public String home() {
        return "home";
    }
}
