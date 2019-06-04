package controller;

import com.alibaba.fastjson.JSON;
import domain.User;
import mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import utils.CommonUtil;
import utils.validate.Login;
import utils.validate.Register;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginAndRegisterController {
    Logger logger = LoggerFactory.getLogger(LoginAndRegisterController.class);
    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @PostMapping("/register")
    public String register(@Validated({Register.class}) User user, BindingResult result,HttpServletRequest request){
        logger.info("进入register");
        Map resultMap = CommonUtil.getValidatorResult(result);
        String email= user.getEmail();
        if(resultMap.size() != 0){
            return JSON.toJSONString(resultMap);
        }else {
            if(userMapper.selectUserByEmail(email)!=null){
                resultMap.put("email","*该邮箱已被注册");
                resultMap.put("state","false");
                return JSON.toJSONString(resultMap);
            }
            resultMap.put("state","success");
            userMapper.insert(user);
            request.getSession().setAttribute("user",user.getNickname());
            logger.info("注册成功");
            return JSON.toJSONString(resultMap);
        }

    }

    @ResponseBody
    @PostMapping(value="/login")
    public String login(@Validated({Login.class}) User user, BindingResult result, HttpServletRequest request) {
        //输入格式校验
        logger.info("进入login");
        Map resultMap = CommonUtil.getValidatorResult(result);
        if(resultMap.size() != 0){
            return JSON.toJSONString(resultMap);
        }else {
            if(userMapper.selectUserByEmail(user.getEmail())==null){
                resultMap.put("email","*该邮箱不存在");
                resultMap.put("state","false");
                return JSON.toJSONString(resultMap);
            }
            User u = userMapper.selectUserByEmailAndPwd(user.getEmail(),user.getPassword());
            if(u==null){
                resultMap.put("password","*密码不正确");
                resultMap.put("state","false");
                return JSON.toJSONString(resultMap);
            }
            resultMap.put("state","success");
            request.getSession().setAttribute("user",u.getNickname());
            logger.info("登录成功");
            return JSON.toJSONString(resultMap);
        }
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
