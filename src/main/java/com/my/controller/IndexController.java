package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description: To do
 * <p>
 * Author : Adore Chen
 * Created: 2018-08-23
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String greeting(Model model) {
        return "index";
    }

}
