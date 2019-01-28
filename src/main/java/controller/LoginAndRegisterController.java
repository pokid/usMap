package controller;

import domain.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.serviceImpl.TestBootServiceImpl;

import javax.validation.Valid;
@Controller
public class LoginAndRegisterController {

    @Autowired
    private UserMapper userMapper;


    @PostMapping("/register")
    public String register(@Valid User user, BindingResult result,Model model){
        //判断邮箱有没有被注册过
        //非空由前端验证
        //后端只验证，是否注册过
//        model.addAttribute("flag","register");
        System.out.println("进入register");
        return "";
//        String inputemail= user.getEmail();
//        User testuser=userMapper.selectUserByEmail(inputemail);
//        if (testuser==null){
//            //注册
//            System.out.println("注册成功");
//            userMapper.insert(user);
//            return "map";
//        }
//        else{
//            //该用户已经被注册
//            System.out.println("该用户已被注册");//要反馈到前端
//            return "toLoginAndRegister?flag=register";
//        }

//        if(result.hasErrors()){
//            System.out.println(result.getAllErrors());
//        }
//        model.addAttribute("kk","邮箱不可为空"); //返回loginAndRegister时，kk显示不出来，所以先以map，代替


    }
    @RequestMapping(value="/login")
    public String login(@Valid User inputuser,Model model) {
        System.out.println("进入login");
        return "";
//        model.addAttribute("flag","login");
//        String inputemail ;
//        inputemail  = inputuser.getEmail();
//        String inputpassword;
//        inputpassword = inputuser.getPassword();
//
//        User user = userMapper.selectUserByEmail(inputemail);
//        if (user == null) {
//            System.out.println("该邮箱并未注册！");
//            return "/toLoginAndRegister";
//        } else {
//            String dbpw = user.getPassword();
//            if (dbpw.equals(inputpassword)) {
//                System.out.println("登录成功！");
//                return "map";//不可返回空
//            } else {
//                System.out.println("密码错误！");
//                return "/toLoginAndRegister?flag=login"; //不可返回空
//            }
//
//        }
    }

    //请求一个参数

//    @GetMapping("/login/{email}")
//        public String login(@PathVariable String email){
//            User user=userMapper.selectUserByEmail(email);
//            System.out.println(user.getPassword());
//            System.out.println(email);
//            return null;
//        }
    //请求两个参数

//    @RequestMapping(value="/login")
//    public String login(@RequestParam(value="email") String email,@RequestParam(value="password") String password){
//        System.out.println("login" + " email:" + email + "password:" +password);
//        User user=userMapper.selectUserByEmail(email);
//        if(user==null){
//            System.out.println("该邮箱并未注册！");
//            return "loginAndRegister";
//        }else{
//            String dbpw=user.getPassword();
//            if(dbpw.equals(password)){
//                System.out.println("登录成功！");
//                return "loginAndRegister";//不可返回空
//            }else{
//                System.out.println("密码错误！");
//                return "loginAndRegister"; //不可返回空
//            }
//        }



//    @PostMapping("/login")
//    public String login(@Valid User user, BindingResult result,Model model) {
//        System.out.println(user.getEmail());
//        return null;
//    }





}
