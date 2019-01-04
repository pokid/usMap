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
    String home(Model model) {
        System.out.println(testBootService.selectByPrimaryKey(1));
        model.addAttribute("name","你军哥哥1");
        return "index";
    }

    @RequestMapping("/toLoginAndRegister")
    String toLoginAndRegister(Model model,String flag) {
        if(flag == null)
            flag = "login";
        System.out.println(flag);
        model.addAttribute("flag",flag);
        return "loginAndRegister";
    }

    @RequestMapping("/toMap")
    String toMap(Model model) {
        System.out.println(testBootService.selectByPrimaryKey(1));
        model.addAttribute("name","你军哥哥大作");
        return "map";
    }
}
