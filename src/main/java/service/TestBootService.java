package service;

import domain.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestBootService {
    @Autowired
    private UserMapper userMapper;

    public User selectByPrimaryKey(int userID){
        return  userMapper.selectByPrimaryKey(1);
    }

    public void insertSelective(User user){

        userMapper.insertSelective(user);
    }
}
