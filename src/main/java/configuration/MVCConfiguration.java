package configuration;

import interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 登陆校验拦截器配置
 */

@Configuration
public class MVCConfiguration implements WebMvcConfigurer {

    @Autowired
    LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //登录拦截的管理器
        InterceptorRegistration registration = registry.addInterceptor(loginInterceptor);
        //添加拦截路径
//        registration.addPathPatterns("/**");
        //添加不拦截路径
//        registration.excludePathPatterns("","/","/toLoginAndRegister","/static/**","/error");
        registration.excludePathPatterns("/**");

    }
}
