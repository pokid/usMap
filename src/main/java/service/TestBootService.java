package service;

import domain.User;

public interface TestBootService {

    User selectByPrimaryKey(int userID);

    void insertSelective(User user);
}
