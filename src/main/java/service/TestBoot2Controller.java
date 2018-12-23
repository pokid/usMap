package service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestBoot2Controller {
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World123!";
    }
}
