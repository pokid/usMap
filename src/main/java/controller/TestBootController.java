package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import service.serviceImpl.TestBootServiceImpl;

import javax.validation.Valid;

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
        model.addAttribute("flag",flag);
        return "loginAndRegister";
    }

    @RequestMapping("/toMap")
    String toMap(Model model) {
        System.out.println(testBootService.selectByPrimaryKey(1));
        model.addAttribute("name","你军哥哥");
        return "map";
    }

    @RequestMapping("/login")
    String login(@Valid User user, BindingResult result, Model model) {
        System.out.println("------123=------");
        System.out.println(user);
        if(result.hasErrors()){
            System.out.println(result.getAllErrors());
        }
        return "/toLoginAndRegister";
    }
}
