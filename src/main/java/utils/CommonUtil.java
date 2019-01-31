package utils;

import com.alibaba.fastjson.JSON;
import domain.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonUtil {

    //校验结果封装->jsonString
    //对于同一个字段的多个错误只加载第一条
    public static Map<String, String> getValidatorResult(BindingResult result) {
        Map<String, String> map = new HashMap();
        //前端输入格式校验
        if (result.hasErrors()) {
            List<FieldError> list = result.getFieldErrors();
            for (FieldError error : list) {
                if (map.containsKey(error.getField())) {
                    continue;
                }
                map.put(error.getField(), error.getDefaultMessage());
            }
            map.put("state","false");
        }
        return map;
    }
}
