package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.serviceImpl.TestBootServiceImpl;

@Controller
public class TestBootController {

    @Autowired
    private TestBootServiceImpl testBootService;
    @RequestMapping("/")
    @ResponseBody
    String home() {

        System.out.println(testBootService.selectByPrimaryKey(1));
        return "Hello World!";
    }
}
