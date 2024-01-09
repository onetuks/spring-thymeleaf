package com.tangerine.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/template")
public class TemplateController {

    @GetMapping(path = "/fragment")
    public String fragment() {
        return "template/fragment/fragmentMain";
    }

    @GetMapping(path = "/layout")
    public String layout() {
        return "template/layout/layoutMain";
    }

}
