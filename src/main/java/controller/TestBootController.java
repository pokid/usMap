package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.serviceImpl.TestBootServiceImpl;

@Controller
public class TestBootController {

    @Autowired
    private TestBootServiceImpl testBootService;
    @GetMapping("/")
        //@ResponseBody 传值用ResponseBody，页面跳转不要用
        //templates为页面模板  static为静态资源
    public String home(Model model) {
        model.addAttribute("name","你军哥哥1");
        return "index";
    }

    @GetMapping("/toLoginAndRegister")
    public String toLoginAndRegister(Model model,String flag) {
        if(flag == null)
            flag = "login";
        model.addAttribute("flag",flag);
        return "loginAndRegister";
    }

    @GetMapping("/toMap")
    public String toMap(Model model) {
        System.out.println("===========");
        System.out.println(testBootService.selectByPrimaryKey(1));
        model.addAttribute("name","你军哥哥");
        return "map";
    }

//    @RequestMapping("/login")
//    String login(@Valid User user, BindingResult result, Model model) {
//        System.out.println("------123=------");
//        System.out.println(user);
//        if(result.hasErrors()){
//            System.out.println(result.getAllErrors());
//        }
//        return "/toLoginAndRegister";
//    }
}
