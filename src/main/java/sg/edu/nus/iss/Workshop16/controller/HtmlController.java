package sg.edu.nus.iss.Workshop16.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping ("/")
    public String getListpage(){
        return "index";
    }
    
    
}
