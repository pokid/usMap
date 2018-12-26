package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import service.serviceImpl.TestBootServiceImpl;

@Controller
public class TestBootController {

    @Autowired
    private TestBootServiceImpl testBootService;
    @RequestMapping("/")
    //@ResponseBody 传值用ResponseBody，页面跳转不要用
    //templates为页面模板  static为静态资源
    //别问我问什么不放在webapp下。sprintboot的坑我已经踩了
    String home(Model m) {
        System.out.println(testBootService.selectByPrimaryKey(1));
        m.addAttribute("name","你军哥哥");
        return "test";
    }
}
