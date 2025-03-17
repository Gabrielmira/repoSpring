package com.example.attunicap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHome {
    public ControllerHome() {
    }

    @GetMapping({"/", "/{path:[^\\.]*}"})
    public String index() {
        return "forward:/index.html";
    }
}

