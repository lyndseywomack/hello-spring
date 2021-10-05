package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

@GetMapping("form")
@ResponseBody
public String languageForm(){
    String form =
            "<html>" +
                    "<body>" +
                    "<form method = 'get' action = '/form'>" +
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
}
