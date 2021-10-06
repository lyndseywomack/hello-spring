package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
public class HelloController {

    @GetMapping("form")
    @ResponseBody
    public String languageForm() {
        String form =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<input type = 'text' name = 'name'" +
                        "<label></label>" +
                        "<select name = 'languages'>\n" +
                        "  <option value=\"english\">English</option>\n" +
                        "  <option value=\"french\">French</option>\n" +
                        "  <option value=\"mandarin\">Mandarin</option>\n" +
                        "  <option value=\"portuguese\">Portuguese</option>\n" +
                        "  <option value=\"spanish\">Spanish</option>\n" +
                        "</select>" +
                        "<button>Greet Me!</button>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return form;
    }

    @PostMapping("form")
    @ResponseBody
    public String languageResponse(@RequestParam String name, String languages) {
        if(!(name.equals(" "))){
            if (languages.equals("english")) {
                return "Hello, " + name + "!";
            } else if (languages.equals("french")) {
                return "Bonjour, " + name + "!";
            } else if (languages.equals("mandarin")) {
                return "你好, " + name + "!";
            } else if (languages.equals("portuguese")) {
                return "Olá, " + name + "!";
            } else if (languages.equals("spanish")) {
                return "Hola, " + name + "!";
            } else {
                return "Hello, you!";
            }
        } else {
            return "Hello, world!";
        }
    }
}
